package JavaCollection;

import java.util.ArrayList;

public class ArrayListDemoPart01 {
    public static void main(String[] args) {

        //Declare ArrayList
        ArrayList al = new ArrayList();//for heterogeneous data
       // ArrayList<String> cars = new ArrayList<String>();//for homogenious i.e here string data type

        al.add("Java");//index = 0
        al.add(66);//index = 1
        al.add('R');
        al.add(13.5);
        al.add(true);

        //Print array list
        System.out.println(al);

        //size method
        System.out.println("Size of ArrayList is" + al.size());

        //remove element
        al.remove(1);// remove element at index 1 i.e. 66
        //Print after removing
        System.out.println("Print after removing" + al);

        //insert element in arraylist
        al.add(2, "Rishabh");
        System.out.println(al);

        //Set method - to replace/change element
        al.set(1, "Krishna");
        System.out.println(al);

        al.get(0);
        System.out.println("Access element of index 0" + al.get(0));

        //Contains method - used to search elements in Arraylist
        System.out.println(al.contains("Rishabh"));
        System.out.println("Is arraylist empty:" + al.isEmpty());

        //clear method - Remove all the elements from the list.
        al.clear();
        System.out.println("After clear method:" + al);

    }
}
