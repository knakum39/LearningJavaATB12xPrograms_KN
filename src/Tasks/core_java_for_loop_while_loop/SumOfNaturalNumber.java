package Tasks.core_java_for_loop_while_loop;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int sum =0;

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            //sum += i; // Add each number to sum
            sum = sum + i;
        }
        // Print the result
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}
