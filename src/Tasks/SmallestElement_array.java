package Tasks;

public class SmallestElement_array {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 3, 25, 1};

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // update if smaller value found
            }
        }

        // Print the smallest element
        System.out.println("Smallest element in the array is: " + smallest);
    }
}