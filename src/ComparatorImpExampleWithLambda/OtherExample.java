package ComparatorImpExampleWithLambda;

import java.util.*;

public class OtherExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"bhmet");
        Employee e2 = new Employee(3,"ahmet");
        Employee e3 = new Employee(9,"zeynep");
        Employee e4 = new Employee(9,"selim");
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Comparator<Employee> comparator = (a,b) -> a.no - b.no;
        Comparator<Employee> comparator2 = (a,b) -> (a.name).compareTo(b.name);

//        System.out.println(comparator.compare(e1,e2));

        Comparator<Employee> a = comparator.thenComparing(comparator2);
        Collections.sort(list,a);
        Iterator<Employee> it = list.iterator();
        while(it.hasNext()){
            Employee e = it.next();

            if((e.name).equals("selim")){
                it.remove();
            }

        }




    }
}
