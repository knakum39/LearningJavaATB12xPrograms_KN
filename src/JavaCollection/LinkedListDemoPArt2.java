package JavaCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemoPArt2 {
    public static void main(String[] args) {

        //Create linked list for String
        LinkedList<String> cars = new LinkedList<String>();

        //add elelemts for Linked list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
//        System.out.println("Before addfirst method" + cars);//[Volvo, BMW, Ford]
//
//        cars.addFirst("Mercidez");
//        System.out.println("After addFirst method" + cars);
//
//        cars.addLast("Toyoto");
//        System.out.println("After addLast method" + cars);
//
//        cars.removeFirst();
//        System.out.println(cars);
//
//        cars.removeLast();
//        System.out.println(cars);
//
//        System.out.println(cars.getFirst());
//        System.out.println(cars.getLast());

        System.out.println("Before push method" + cars);//[Volvo, BMW, Ford]
//Push Opertion - used for stack

        cars.push("new car");
        System.out.println("After puch method:"+ cars);

        System.out.println("POP Operation:"+ cars.pop());
        System.out.println("After POP method list contains:" + cars);

        /*********************Peek()********************************/

        System.out.println("Peek():" + cars.peek());
        System.out.println("List contains after peek() methods:"+ cars);

        for(int i=0; i<cars.size();i++)
        {
            System.out.println(cars.get(i));
        }

        //for each method
        for(Object e: cars)
        {
            System.out.println(e);
        }

        //Iterator method
        Iterator it = cars.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
//sort linked list
        System.out.println("Before sorting:" + cars);
        Collections.sort(cars);
        System.out.println("After sorting:" + cars);
        System.out.println(cars);

        //sort in reverse order
        Collections.sort(cars,Collections.reverseOrder());
        System.out.println("After sorting in reverse order"+ cars);

    }
}
