package Set.HashSet;

import ComparatorImpExampleWithLambda.Employee;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Employee> eSet = new HashSet<>();
        Employee e1 = new Employee(3,"busra");
        Employee e2 = new Employee(8,"ahmet");
        Employee e3 = new Employee(9,"zeynep");
        Employee e4 = new Employee(10,"selim");
        Employee e5 = new Employee(3,"busra");

        // HashSet do not add to same element but
        // class have to implement the equals() and hashCode() method
        // hashSet may add to same element if class do not implement these method
        System.out.println(eSet.add(e1));
        System.out.println(eSet.add(e2));
        System.out.println(eSet.add(e3));
        System.out.println(eSet.add(e4));
        System.out.println(eSet.add(e5));


    }
}
