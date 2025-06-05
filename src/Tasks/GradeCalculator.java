package Tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for score
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        // Check score range and assign grade
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Grade: F");
        } else {
            // Invalid input (less than 0 or more than 100)
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        }
    }
}
