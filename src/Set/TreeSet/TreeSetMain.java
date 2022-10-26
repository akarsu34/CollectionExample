package Set.TreeSet;

import ComparatorImpExampleWithLambda.Employee;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        // it is sorted list
        // super class -> NavigableSet and SortedSet
        // SortedSet's child class have to implement Comparable Interface
        // or have to Comparator argument
        Set<String> eSet = new TreeSet<>();

        // input String list : akın busra ahmet zeynep selim busra ali banu

        for (int i = 0; i < args.length; i++) {
            eSet.add(args[i]);
//            printList(eSet);
        }
        otherExample();


    }

    public static void printList(Set set){
        System.out.println(set);
    }

    public static void otherExample(){

        // Employee is not comparable
        Comparator<Employee> com = (a,b) -> a.name.compareTo(b.name);

        Set<Employee> eSet = new TreeSet<>(com);
        Employee e1 = new Employee(3,"busra");
        Employee e2 = new Employee(30,"ahmet");
        Employee e3 = new Employee(9,"zeynep");
        Employee e4 = new Employee(10,"selim");
        Employee e5 = new Employee(3,"busra");
        eSet.add(e1);
        eSet.add(e2);
        eSet.add(e3);
        eSet.add(e4);
        eSet.add(e5);

        eSet.forEach(s -> System.out.println(s.name + " " + s.no));

    }
}
