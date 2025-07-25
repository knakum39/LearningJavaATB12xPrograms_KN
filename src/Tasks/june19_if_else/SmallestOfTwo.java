package Tasks.june19_if_else;

import java.util.Scanner;

public class SmallestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare the two numbers
        if (num1 < num2) {
            System.out.println(num1 + " is the smallest number.");
        } else if (num2 < num1) {
            System.out.println(num2 + " is the smallest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}
