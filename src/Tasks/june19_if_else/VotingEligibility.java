package Tasks.june19_if_else;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age from user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age >= 0) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("Invalid age entered.");
        }

        scanner.close();
    }
}
