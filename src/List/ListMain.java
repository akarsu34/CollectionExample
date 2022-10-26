package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        // two implemention of List Interface
        // ArrayList<>() and LinkedList<>();

        ArrayList<String> arrayList = getArrayList();
        LinkedList<String> linkedList = getLinkedList();
        System.out.println("------arrayList------------");
        printList(arrayList);
        System.out.println("------linkedList------------");
        printList(linkedList);


    }

    public static ArrayList<String> getArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("ahmet");
        list.add("mehmet");
        list.add("zeynep");
        list.add("busra");
        return list;
    }

    public static LinkedList<String> getLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("ahmet");
        list.add("mehmet");
        list.add("zeynep");
        list.add("busra");
        return list;
    }
    public static void printList(List<String> list){
        list.forEach(s -> System.out.println(s));

    }
}
