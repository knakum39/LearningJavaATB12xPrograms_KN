package ex_15_StringBuffer_Builder_StringFunctions;

public class task_WordCounter {
    public static void main(String[] args) {
        String input = "  Hello   world, this is   Java! ";

        // Remove extra spaces and split by space

        String cleaned = input.trim().replaceAll("\\s+", " ");
        String[] words = cleaned.split(" ");

//        Purpose: Replaces one or more whitespace characters (spaces, tabs, newlines, etc.) inside the string with a single space.
//\\s+ is a regular expression:
//\\s matches any whitespace character.
//                + means one or more occurrences.
        System.out.println("Word count: " + words.length);
    }

}
