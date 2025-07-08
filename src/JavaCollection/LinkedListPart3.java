package JavaCollection;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListPart3 {
    public static void main(String[] args) {
        //create priority queue
       // PriorityQueue pq = new PriorityQueue(); //random order
         LinkedList pq = new LinkedList(); // maintains order
        pq.add(10);//throws an exception for unsuccessful insertion
        pq.add(20);
        pq.add(5);
        pq.add(40);
        pq.offer(70);//returns false for unsuccessful insertion
        pq.add(40);//duplicate
        pq.add("Riha");

        System.out.println(pq);

        //access element - element () and peek() method
        //    pq.clear();
        //   System.out.println(pq.element());
        // System.out.println(pq.peek());

//remove element using remove() and poll() method
        System.out.println(pq.remove());
        //   System.out.println(pq.poll());

        //Read the element of the priority queuw

//        Iterator it = pq.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        for(Object e: pq)
        {
            System.out.println(e);
        }
    }
}