package Tasks.june19_if_else;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1️⃣ Take user input
        System.out.print("Enter your marks (0 - 100): ");
        int marks = scanner.nextInt();

        // 2️⃣ Check for valid input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            // 3️⃣ Check grading conditions
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: D");
            } else if (marks >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: Fail");
            }
        }

        scanner.close();
    }
}
