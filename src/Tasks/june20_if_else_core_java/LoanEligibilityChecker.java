package Tasks.june20_if_else_core_java;

import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Age:");
        int age = scanner.nextInt();  // Changed variable name to lowercase (convention)

        System.out.println("Enter the Salary:");
        float salary = scanner.nextFloat();  // Changed variable name to lowercase

        System.out.println("Enter the Credit Score:");
        int creditScore = scanner.nextInt();  // Changed variable name to camelCase

        // Age Validation
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age < 18) {
            System.out.println("You must be at least 18 years old to apply for a loan.");
        } else {
            // Loan eligibility criteria
            if (salary >= 30000 && creditScore >= 600) {
                System.out.println("Congratulations! You are eligible for the loan.");
            } else {
                System.out.println("Sorry, you are not eligible for the loan.");

                // Additional feedback
                if (salary < 30000) {
                    System.out.println("- Your salary is below the minimum requirement ($30,000).");
                }
                if (creditScore < 600) {
                    System.out.println("- Your credit score is below the minimum requirement (600).");
                }
            }
        }
    }
}