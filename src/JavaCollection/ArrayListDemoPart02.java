package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemoPart02 {
    public static void main(String[] args) {
        //declare array list/cpllection
        ArrayList<String> al = new ArrayList<String>();

        al.add("K");//index = 0
        al.add("R");//index = 1
        al.add("J");
        al.add("O");
        al.add("P");

//        System.out.println(al);
//
//        //To add one arraylist in another array;ist
//        ArrayList<String> al2 = new ArrayList<String>();
//         System.out.println("Before Adding:" + al2);
//
//         al2.addAll(al);
//        System.out.println("After Adding:" + al2);
//
//        al2.removeAll(al);
//        System.out.println("After removing" + al2);

        //Loop through elements of Array list
        //1. For loop
        //2.For each
        //3. iterator

        //1. For loop
//        for(int i=0; i <al.size(); i++)
//        {
//            System.out.println(al.get(i));
//        }

      //  System.out.println(" ");

        //2. for each
//        for(String i: al)
//        {
//            System.out.println(i);
//        }

        //3. Iterator interface
//        Iterator it = al.iterator();
//
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        //Sort Arraylist
        System.out.println("Before Sorting" + al);
        Collections.sort(al);
        System.out.println("After Sorting" + al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After reverse order sorting" + al);

        //Shuffle Arraylist - random order each time
        Collections.shuffle(al);
        System.out.println("After shuffling:"+ al);

        //Create string array- We can create array list rom the array
        String cars[] = {"Volvo", "BMW", "Ford"};

        ArrayList al3 = new ArrayList(Arrays.asList(cars));
        System.out.println(al3);

    }
}
