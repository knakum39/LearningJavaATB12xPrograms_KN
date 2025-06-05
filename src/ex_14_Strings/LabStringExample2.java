package ex_14_Strings;

public class LabStringExample2 {
    public static void main(String[] args) {


        CharSequence s = "Krishna".subSequence(1, 4);   // "ris"
        CharSequence s1 = "Krishna".subSequence(2, 7);  // "ishna"

        System.out.println(s1); // prints: ishna
        System.out.println(s);  // prints: ris


    }
}