package Tasks.june19_if_else;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character from the user
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // convert to lowercase for simplicity

        // Check if it's a letter
        if ((ch >= 'a' && ch <= 'z')) {
            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet character.");
        }

        scanner.close();
    }
}
