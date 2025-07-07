package JavaCollection;

import java.util.LinkedList;

public class LinkedListDemoPart1 {
    public static void main(String[] args) {
//Declare Link list
        LinkedList<String> ll1 =  new LinkedList<String>();
        ll1.add("Rishabh");
        ll1.add("Rishabh weds Krishna");
        ll1.add("Ram");

        System.out.println("After adding elelments:" + ll1);

        ll1.add(1,"Simandhar"/*Object*/);
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Kina");
        ll2.add("tina");
        //add collection2 data i.e ll1 into collection 1 i.e.ll
        ll1.addAll(ll2);
        System.out.println("After adding collection2 to colelction1:" + ll1);
        System.out.println(ll2);

        //Remove methids
        ll1.remove("Ram");
        System.out.println(ll1);

        ll1.remove(4);
        System.out.println(ll1);

        //Remove collection2 from collection1
        ll1.removeAll(ll2);
        System.out.println("After removing collection2 from collection1:" + ll1);

        //get element of position 1st
        System.out.println("Element at 1st position is :" + ll1.get(1));

        //Repalce 1st position element by "Dada"
        ll1.set(1, "Dada");
        System.out.println(ll1);

        //Contains method - check if simandhar exists in the collection1
        System.out.println(ll1.contains("Simandhar"));
        System.out.println(ll1.contains("Dada"));

        //remove all elements from the collection2
        ll2.clear();
        System.out.println(ll2);




    }
}
