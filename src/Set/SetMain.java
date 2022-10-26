package Set;


import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        Set duplicateSet = new HashSet();
        Set set =new HashSet();

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("input 10 name :");
            String name = in.next();
            // only uniq element

            if(!set.add(name)){
                duplicateSet.add(name);
            }

        }
        System.out.println("set : " + set);
        System.out.println("duplicate names : " + duplicateSet);

    }
}
