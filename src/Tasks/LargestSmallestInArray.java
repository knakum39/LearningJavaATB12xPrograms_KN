package Tasks;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 2, 33, 76};

        // Initialize both max and min to the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array to find max and min
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
