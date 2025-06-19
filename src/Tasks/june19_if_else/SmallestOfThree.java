package Tasks.june19_if_else;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Compare using if-else
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " is the smallest number.");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is the smallest number.");
        } else {
            System.out.println(num3 + " is the smallest number.");
        }

        scanner.close();
    }
}
