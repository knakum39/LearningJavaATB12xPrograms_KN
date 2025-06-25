package Tasks.june20_if_else_core_java;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if it's an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is NOT an alphabet.");
        }

        scanner.close();
    }
}
