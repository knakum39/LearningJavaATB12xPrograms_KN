package Tasks.june20_if_else_core_java;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is NOT a palindrome.");
        }
    }

        // Method to check if a number is a palindrome
        public static boolean isPalindrome(int num) {
            int original = num;
            int reversed = 0;

            while (num > 0) {
                int digit = num % 10;              // Get last digit
                reversed = reversed * 10 + digit;  // Build reversed number
                num = num / 10;                    // Remove last digit
            }

            return original == reversed;
    }
}
