package JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        //LinkedHashSet<Integer> linkedHasSet = new LinkedHashSet<Integer>();

        //Duplication is not allowed.
        //Insertion order is maintained.
      LinkedHashSet linkedHasSet = new LinkedHashSet();
       // HashSet linkedHasSet = new HashSet();
        linkedHasSet.add(100);
        linkedHasSet.add(200);
        linkedHasSet.add(300);
        linkedHasSet.add(400);
        linkedHasSet.add(500);
        linkedHasSet.add(400);


        System.out.println(linkedHasSet);




    }
}
