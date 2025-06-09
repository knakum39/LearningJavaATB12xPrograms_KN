package Self_practice;

import java.util.Scanner;

public class FloatArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(float):");
        int size = scanner.nextInt();

        float[] marks = new float[size];  // float array

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter mark #" + (i + 1) + ": ");
            marks[i] = scanner.nextFloat(); // read float
        }

        System.out.println("==== Stored Float Marks ====");
        for (float mark : marks) {
            System.out.println(mark);
        }

        scanner.close();
    }
}
