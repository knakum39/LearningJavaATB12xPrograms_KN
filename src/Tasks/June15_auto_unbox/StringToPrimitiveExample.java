package Tasks.June15_auto_unbox;

public class StringToPrimitiveExample {
    public static void main(String[] args) {

        // A numeric string
        String numberStr = "123";

        // Convert String to primitive int using Integer.parseInt()
        int number = Integer.parseInt(numberStr);

        // Output the result
        System.out.println("String value: " + numberStr);
        System.out.println("Converted int value: " + number);

        // You can now use the int in arithmetic operations
        int doubled = number * 2;
        System.out.println("Doubled value: " + doubled);
    }
}
