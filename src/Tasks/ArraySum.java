package Tasks;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};  // Example array
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            //sum += numbers[i];  // Add each element to sum
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}

