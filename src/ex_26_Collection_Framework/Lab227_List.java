package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","apple","guava","mango","watermalon");
        System.out.println(fruits);

        List arrayList = new ArrayList<>(); //this is concept of dynamic dispatch. parent's ref with child object.
        arrayList.add("Krishna");
        arrayList.add("Krishna");
        arrayList.add(null);
        arrayList.add(123);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
