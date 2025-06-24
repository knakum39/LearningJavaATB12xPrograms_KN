package Tasks.June15_auto_unbox;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            // This line will throw ArithmeticException: / by zero
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block handles the exception
            System.out.println("ArithmeticException caught: Cannot divide by zero.");
        }

        System.out.println("Program continues after the exception handling.");
    }
}
