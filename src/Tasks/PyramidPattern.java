package Tasks;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this value for a bigger or smaller pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}

