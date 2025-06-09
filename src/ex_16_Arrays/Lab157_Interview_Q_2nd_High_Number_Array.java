package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 99};//100,34
        Arrays.sort(numbers);  // 🔹 This line sorts the array in ascending order

//        System.out.println("Sorted array:");
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
//        System.out.println(" " );
        System.out.println("Second highest number in array is:");
        System.out.println(numbers[numbers.length - 2]);
//        System.out.println(numbers[numbers.length - 3]);
//        System.out.println(numbers[numbers.length - 4]);
    }
}