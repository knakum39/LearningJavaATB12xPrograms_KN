package Tasks.June17_Basic_If_else;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a character
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        // Check if the input is an alphabet
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet character.");
        } else {
            //Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
            scanner.close();
        }
    }
}