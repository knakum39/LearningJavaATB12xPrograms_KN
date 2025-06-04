package Tasks;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Reverse the string manually
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if original equals reversed
        if (input.equals(reversed)) {//  checks whether both strings have exactly the same characters in the same order.
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}