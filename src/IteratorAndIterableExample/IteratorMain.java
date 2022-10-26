package IteratorAndIterableExample;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMain {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("on");
        stringSet.add("oniki");
        stringSet.add("yirmi");
        stringSet.add("bir");
        stringSet.add("otuz");
        stringSet.add("ellisekiz");

        Collection col = stringSet;
        Iterator iterator = col.iterator();
//        col.add("elli");
//        col.remove("on");

        System.out.print(col+" ");
        while(iterator.hasNext()){
            Object next = iterator.next();
            String s = (String) next;

            if(s.endsWith("i")){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.print(col+" ");
        System.out.println();
        col.add("seksen");
        System.out.print(col+" ");
        iterator = col.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            String s = (String) next;
            if(s.equals("seksen")){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.print(col+" ");
    }
}
