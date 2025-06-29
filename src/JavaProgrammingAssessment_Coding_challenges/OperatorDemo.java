package JavaProgrammingAssessment_Coding_challenges;

public class OperatorDemo {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

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
