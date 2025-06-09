package Self_practice;

import java.util.Scanner;

public class IntArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array (int): ");
        int size = scanner.nextInt();

        int[] marks = new int[size];  // integer array

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter mark #" + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); // read integer
        }

        System.out.println("==== Stored Marks ====");
        for (int mark : marks) {
            System.out.println(mark);
        }

        scanner.close();
    }
}

