package Tasks;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 89, 23, 90, 3};

        // Assume the first element is the largest
        int largest = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // update if a bigger number is found
            }
        }

        // Print the largest element
        System.out.println("Largest element in the array is: " + largest);
    }
}
