package ComparatorImpExampleWithLambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BookTest {
    public static void main(String[] args) {

        List<Book> bookList = BookFactory.getBookList();
        Comparator<Book> com =(b1,b2) -> b1.getPages()-b2.getPages();
        Collections.sort(bookList,com);
        for (Book b :
                bookList) {
            System.out.println(b.toString());
        }
        System.out.println("*************");
        Book book1 = randomBook();
        Book book2 = randomBook();

        Comparator<Book> x = (a, b) -> a.getPages() - b.getPages();
        BinaryOperator<Book> check = BinaryOperator.maxBy(x);
        System.out.println("+++++++ " + book1.getTitle() +" ["+ book1.getPages()+ "]   &   " + book2.getTitle()+" ["+ book2.getPages()+"] +++++++");
        System.out.println(check.apply(book1, book2));

    }

    public static Book randomBook() {
        List<Book> bookList = BookFactory.getBookList();
        Random r = new Random();
        int value = r.nextInt(bookList.size());
        Function<Integer, Book> rassal = (v) -> bookList.get(v);
        return rassal.apply(value);
    }
}
