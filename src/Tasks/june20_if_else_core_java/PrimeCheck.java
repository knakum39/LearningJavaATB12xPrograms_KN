package Tasks.june20_if_else_core_java;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        // Check for edge cases
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }

        scanner.close();
    }
}
