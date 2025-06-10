package Tasks;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 0, 1};
        int[] result = new int[arr.length]; // Default initialized with 0s
        int index = 0;

        // First, add all non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        // Print the result array
        System.out.print("Array after moving zeros to the end: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
