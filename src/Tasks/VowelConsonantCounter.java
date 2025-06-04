package Tasks;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // This creates a Scanner object called scanner that reads input from the console (keyboard).
        System.out.println("Enter a String: ");// This displays a message prompting the user to enter a string.
        String input = scanner.nextLine(); //  This reads the entire line of text entered by the user and stores it in the input variable.

        int vowels = 0, consonants = 0;

        input = input.toLowerCase();  // Step 1: Make it case-insensitive ,  Converts the entire string to lowercase so you don’t have to separately check for 'A' vs 'a', etc.

        for (int i = 0; i < input.length(); i++) { // This is a for loop that goes through each character in the string from index 0 to input.length() - 1.
            char ch = input.charAt(i); //Retrieves the character at the current index i and stores it in the variable ch.
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of Vowels are:" + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


//loGIC
//Convert the string to lowercase (to handle both upper and lower case letters).
//
//Loop through each character in the string.
//
//Check if the character is a letter using Character.isLetter().
//
//If it's a vowel (a, e, i, o, u), increment the vowel counter.
//
//If it's a letter but not a vowel, increment the consonant counter.
//
//        Ignore digits, spaces, and symbols.