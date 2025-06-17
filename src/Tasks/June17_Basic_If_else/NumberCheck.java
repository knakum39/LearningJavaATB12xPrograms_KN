package Tasks.June17_Basic_If_else;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if(number>0){
            System.out.println("The number is positive.");
        } else if (number <0) {
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}
