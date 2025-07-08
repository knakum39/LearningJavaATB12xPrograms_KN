package JavaCollection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {

        //Create HashMap in java
        HashMap<Integer, String> language = new HashMap<>();

        //add elelemts to hashmap
        language.put(1,"Java");//1st entry
        language.put(2,"Python");
        language.put(3,"Javascript");

        System.out.println("Hashmap:" + language);

        //create HashMap in java
        HashMap<Integer, String> language2 = new HashMap<>();

        //add elelemts to hashmap
        language.put(4,"HTML");//1st entry
        language.put(5,"C#");
        language.put(6,"Ruby");

        System.out.println("Hashmap:" + language);

        //get() mthod to get value

       String value = language.get(2);
        System.out.println(value);

        System.out.println(language.keySet());//to get only keys i.e. keyset : [1,2,3]
        System.out.println(language.values());//to get only valuesi.e. collection : values [Java, Python, Javascript]

        System.out.println(language.entrySet());//to get key-value pair..

//        language.replace(2, "C++");
//        System.out.println(language);
       // language.remove(2);
//        System.out.println(language);

//        System.out.println(language.remove(3,"Javascript"));
//        System.out.println(language);
//        System.out.println(language.containsKey(6));
//        System.out.println(language.containsValue("Java"));
//        System.out.println(language.size());
//        System.out.println(language.isEmpty());
//        language.clear();
//        System.out.println(language);

//to add one hashmap ina nothe hash map we use putAll method
        language.putAll(language2);
        System.out.println(language);

        System.out.println(language.keySet());
        //for each loop to access elelemts
//        for(Object e: language.keySet())
//        {
//            System.out.println(e);
//        }
//or
//        for(int i: language.keySet())
//        {
//            System.out.println(i);
//        }

        //Iterator Method:

        Iterator it = language.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Iterator it1 = language.values().iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        Iterator it2 = language.entrySet().iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
