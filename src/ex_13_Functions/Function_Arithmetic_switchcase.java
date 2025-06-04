package ex_13_Functions;
import java.util.Scanner;

public class Function_Arithmetic_switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInt(scanner, "Enter the first number: ");
        int b = readInt(scanner, "Enter the second number: ");

        System.out.println("\nChoose an operation:");
        System.out.println("1 - Addition (+)");
        System.out.println("2 - Subtraction (-)");
        System.out.println("3 - Multiplication (*)");
        System.out.println("4 - Division (/)");
        System.out.println("5 - Modulo (%)");
        System.out.print("Enter your choice (1-5): ");

        int choice = readInt(scanner, "");

        switch (choice) {
            case 1:
                System.out.println("Sum: " + sum(a, b));
                break;
            case 2:
                System.out.println("Difference: " + sub(a, b));
                break;
            case 3:
                System.out.println("Product: " + mul(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Quotient: " + div(a, b));
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Error: Cannot find modulo with zero.");
                } else {
                    System.out.println("Remainder: " + mod(a, b));
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter an integer only.");
            System.exit(0);
            return -1; // Required for compilation
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}