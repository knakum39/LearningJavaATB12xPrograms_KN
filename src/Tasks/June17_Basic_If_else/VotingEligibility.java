package Tasks.June17_Basic_If_else;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility
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
