package Map;

import java.util.*;
import java.util.function.Function;

public class MapMain {
    public static void main(String[] args) {
        // key and value
        Map<String, Integer> map = new HashMap<>();
        map.put("bir", 1);
        map.put("iki", 2);
        map.put("uc", 3);
        map.put("dort", 4);
        map.put("bes", 5);

        map.putIfAbsent("sekiz", 8); // does it if not available

        System.out.println("------all element of Map--------");
        map.forEach((s, i) -> System.out.println(s + " = " + i));

        System.out.println("---------key set-------------");
        Set<String> keySet = map.keySet();
        keySet.forEach((s) -> System.out.println(s));


        System.out.println("*********values*********");
        Collection<Integer> coll = map.values();
        coll.forEach(System.out::println);

        System.out.println("*******entry Set *********");
        Set<Map.Entry<String, Integer>> mapEntries = map.entrySet();
        mapEntries.forEach((s) -> System.out.println(s));

        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            Integer integer = map.get(next);

        }
        System.out.println("***********************");
        // compute method

        map.computeIfAbsent("bir",(a)-> a.length());

        map.forEach((s, i) -> System.out.println(s + " " + i));

        System.out.println("*************new map ************");
        Map<Integer,String> mapp = new HashMap<>(5);
        mapp.put(1,"bir");
        mapp.put(2,"iki");
        mapp.put(3,"uc");
        mapp.put(4,"dort");
        mapp.put(5,"bes");
        mapp.put(6,"alti");
        mapp.put(7,"yedi");
        mapp.put(8,"sekiz");
        mapp.put(9,"dokuz");

        mapp.forEach((k,v)-> System.out.println("key : " + k + " value : " +v));

    }
}
