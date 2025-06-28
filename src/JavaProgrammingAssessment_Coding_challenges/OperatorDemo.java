package JavaProgrammingAssessment_Coding_challenges;

public class OperatorDemo {
    public static void main(String[] args) {

        // Initial variable declarations
        int a = 20;
        int b = 5;

        // Arithmetic operations
        System.out.println("Arithmetic Operators:");
        System.out.println("a+b=" + (a+b));// Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // Assignment operations
        int x = 10;
        System.out.println("\nAssignment Operators:");
        System.out.println("x = " + x);

        //x = x+5;
        x += 5;
        System.out.println("x+5=" + x);

        x -= 3;
        System.out.println("x -= 3 → " + x);

        x *= 2;
        System.out.println("x *= 2 → " + x);

        x /= 4;
        System.out.println("x /= 4 → " + x);

        x %= 3;
        System.out.println("x %= 3 → " + x);
    }
}
