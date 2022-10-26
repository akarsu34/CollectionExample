package AndThenComposeMethod;

import ComparatorImpExampleWithLambda.Book;
import ComparatorImpExampleWithLambda.BookFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        Function<Integer,Integer> twice= (x) -> x*2;
        Function<Integer,Integer> square = (x) -> x*x;

        int value = twice.apply(i);
        value = square.apply(value);
        System.out.println(value);
        //-------------------------
        value = square.apply(i);
        value = twice.apply(value);
        System.out.println(value);
        System.out.println("----------- another way---------------");

        // use to andThen()  and   compose()
        int newValue = twice.andThen(square).apply(i); // first twice() func. then compose() func.
        System.out.println(newValue);
        newValue = twice.compose(square).apply(i); // first compose() func. then twice() func.
        System.out.println(newValue);
        System.out.println("******** other example ******");

        List<Book> bookList = BookFactory.getBookList();
        Comparator<Book> sortingAuthorName = (a,b) -> a.getAuthorFName().compareTo(b.getAuthorFName()) ;
        Comparator<Book> sortingPageCount = (a,b) -> a.getPages() -b.getPages();
        Comparator<Book> sortingByTitle = (a,b) -> a.getTitle().compareTo(b.getTitle());


        Comparator<Book> bookComparator = sortingByTitle.thenComparing(sortingAuthorName).thenComparing(sortingPageCount);
        Collections.sort(bookList,bookComparator);

        Consumer<Book> consumer = System.out::println;
        Book book = BookFactory.getBookList().get(1);
        Consumer<String> conString = book::setAuthorFName;
        conString.accept("duzgun");
        System.out.println("book : " + book);
        for (Book b :
                bookList) {
            consumer.accept(b);

        }

        Supplier<A> newCall = A::new;

        Function<Integer,A> newCall2 = A::new;
        A apply = newCall2.apply(5);
        System.out.println(apply.i);

        Consumer<Boolean> con1 = A::f1;
        BiConsumer<Boolean,Boolean> con2 = A::f2;



    }
}

class A{
    int i;
    public A() {

    }
    public A(int i) {
        this.i = i;
    }
    public static void f1(Boolean b){

    }
    public static void f2(Boolean b1,Boolean b2){

    }
}
