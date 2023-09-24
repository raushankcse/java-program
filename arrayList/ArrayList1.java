package arrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Get operation = O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // set 
        // list.set(2, 10);
        // System.out.println(list);

        // contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // list.add(1, 9);
    }
}
