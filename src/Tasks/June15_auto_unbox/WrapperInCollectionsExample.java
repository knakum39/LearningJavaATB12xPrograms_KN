package Tasks.June15_auto_unbox;

//Java Collections (like ArrayList, HashMap, etc.) can only store objects, not primitive types.
//To store primitive data types (int, double, etc.), Java uses wrapper classes like Integer, Double, etc.
//This is where autoboxing (primitive ➝ wrapper) and unboxing (wrapper ➝ primitive) come into play.

import java.util.ArrayList;
import java.util.List;

public class WrapperInCollectionsExample {
    public static void main(String[] args) {

        // Create a List to store integers
        List<Integer> numbers = new ArrayList<>();

        // Add primitive int values to the list (autoboxing occurs here)
        numbers.add(40); // int is autoboxed to Integer
        numbers.add(20);
        numbers.add(30);

        // Retrieve values from the list (unboxing occurs here)
        int sum =0;
        for(int num : numbers){
            sum = sum + num;  // Integer is unboxed to int
        }
        // Print the result
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
    }
}
