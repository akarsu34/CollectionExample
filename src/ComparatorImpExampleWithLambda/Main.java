package ComparatorImpExampleWithLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ahmet");
        list.add("buse");
        list.add("selim");
        list.add("busra");
        list.add("kemal");
        list.add("ayse");
        list.add("abdulsamet");


        Comparator<String> c = (n1,n2) -> n2.length() - n1.length();

        Collections.sort(list,c);
        for (String s :
                list) {
            System.out.println("name : " + s
            );
        }


    }
}
