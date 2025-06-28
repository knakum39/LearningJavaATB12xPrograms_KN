package JavaProgrammingAssessment_Coding_challenges;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Initial value of x: " + x);

        // Pre-Increment
        System.out.println("\n-- Pre-Increment --");
        System.out.println("Value returned by ++x: " + (++x));  // x becomes 11, then returns 11
        System.out.println("Value of x after ++x: " + x);       // 11

        // Post-Increment
        System.out.println("\n-- Post-Increment --");
        System.out.println("Value returned by x++: " + (x++));  // returns 11, then x becomes 12
        System.out.println("Value of x after x++: " + x);       // 12

        // Pre-Decrement
        System.out.println("\n-- Pre-Decrement --");
        System.out.println("Value returned by --x: " + (--x));  // x becomes 11, then returns 11
        System.out.println("Value of x after --x: " + x);       // 11

        // Post-Decrement
        System.out.println("\n-- Post-Decrement --");
        System.out.println("Value returned by x--: " + (x--));  // returns 11, then x becomes 10
        System.out.println("Value of x after x--: " + x);       // 10
    }
}
