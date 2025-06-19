package Tasks.June17_Basic_If_else;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a first integer
        System.out.println("Enter the First number:");
        int number1 = scanner.nextInt();

        // Prompt user to enter a second integer
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        // Find the maximum using if-else
        if(number1 > number2){
            System.out.println("The maximum number is: " + number1);
        }else if(number2 > number1) {
            System.out.println("The maximum number is: " + number2);
        }else{
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}
