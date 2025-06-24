package Tasks.June15_auto_unbox;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int a = 10;
            int b = 0;

            // This line may throw ArrayIndexOutOfBoundsException
            int value = numbers[5];

            // This line may throw ArithmeticException
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Cannot divide by zero.");
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("General Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
