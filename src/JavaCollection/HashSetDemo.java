package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        //declar Hashset

      //  HashSet hs = new HashSet<>();//for homogeneous data
        HashSet<String> cars = new HashSet<String>();//Hetrogeneous data
        HashSet<String> cars2 = new HashSet<String>();//Hetrogeneous data

        //insert element
        cars.add("Hundai");
        cars.add("Maruti");
        cars.add("BMW");
        cars.add("Maruti");
        cars.add("Ford");

        System.out.println("Elements of Hashset:"+ cars);
        //insert elements in cars2 collection
        cars2.add("Volvo");
        cars2.add("Toyota");

      //add cars2 collection to cars collection
        cars.addAll(cars2);
        System.out.println("After insetring cars in cars2 collection" + cars2);

        //remove elements from hashset
        cars.remove("Maruti");
        System.out.println(cars);

    //    cars.removeAll(cars2);
     //   System.out.println(cars);

        //search BMW in cars collection using contains method
        System.out.println(cars.contains("BMW"));

        System.out.println(cars.containsAll(cars2));

        //isEmpty
        System.out.println("Is cars collection empty:"+ cars.isEmpty());
        System.out.println("Size of cars colelction is:"+ cars.size());

//        cars.clear();
//        System.out.println("cars collection after clear method:"+ cars);

        //Read elements of hasset using for.. each loop..
//        for(Object e: cars){
//            System.out.println(e);
//        }

        //Iterator method for reading elements of hash set
        Iterator it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
