package Tasks;

import java.util.Scanner;

public class OddEvenFromArrayWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Get array elements from the user
        System.out.println("Enter " + size + " integer values:");

        for(int i=0; i < numbers.length ; i++)
        {
           // System.out.println("Enter element"+ " "+ (i+1)+":");
            numbers[i] = scanner.nextInt();
        }

        // Print even numbers
        System.out.println("Even numbers in the array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        // Print odd numbers
        System.out.println("\nOdd numbers in the array:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
