package JavaProgrammingAssessment_Coding_challenges;

public class TypeCastingPrg {
    public static void main(String[] args) {

        //implicit casting: byte → short → int → long → float → double
        int a = 100;
        long b = a;   // int to long (implicit)
        double c = b; // long to double (implicit)

        System.out.println(c);  // Output: 100.0

// Explicit casting:
        double x = 99.99;
        int y = (int) x;  // double to int (explicit)

        System.out.println(y);  // Output: 99
    }
}
