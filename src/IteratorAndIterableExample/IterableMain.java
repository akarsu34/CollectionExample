package IteratorAndIterableExample;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class IterableMain {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("on");
        stringSet.add("oniki");
        stringSet.add("yirmi");
        stringSet.add("bir");
        stringSet.add("otuz");
        stringSet.add("ellisekiz");

        Collection col = stringSet;

        Iterable<String> it = col;
        it.forEach(s -> System.out.println(s.toString() + ": length : " +s.length()));




    }

}
