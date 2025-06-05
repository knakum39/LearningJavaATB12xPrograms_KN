package ex_14_Strings;

public class LabStringExample1 {
    public static void main(String[] args) {

        String s= "Krishna";
        char c = s.charAt(2); //The charAt(int index) method returns the character at the given index in the string.
        // get the character at index 2, which is 'i'.
        // Index = 0, ->
        System.out.println(c);
        System.out.println(s.codePointAt(0));

        //codePointAt(int index) returns the Unicode code point (i.e., the integer value) of the character at the specified index.
        //s.codePointAt(0) gets the code point of the first character, which is 'K'.
        // Unicode code point of 'K' is 75.

        // CompareToIgnore(Sting sr)
//        int result = "abc".compareTo("ABC");
//        int result2 = "abc".compareToIgnoreCase("ABC");
//        System.out.println(result);
//        System.out.println(result2);
//
        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);
        int idx2 = "Java".lastIndexOf("a"); // 3

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("z-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

    }
}
