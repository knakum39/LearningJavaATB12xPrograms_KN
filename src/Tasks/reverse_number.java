package Tasks;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter the number");
        int num = scanner.nextInt();    // Read integer input from user
        int reversed = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            reversed = reversed * 10+digit;
            //System.out.println("Reversed number: " + reversed);
        }
        System.out.println("Reversed number: " + reversed);
    }
}

//✅ Initial Setup:
//num = 1234
//
//reversed = 0
//
//        🔁 Iteration 1:
//num = 1234
//
//digit = 1234 % 10 = 4
//
//reversed = 0 * 10 + 4 = 4
//
//num = 1234 / 10 = 123
//
//        📝 Status after Iteration 1:
//
//reversed = 4
//
//num = 123
//
//        🔁 Iteration 2:
//num = 123
//
//digit = 123 % 10 = 3
//
//reversed = 4 * 10 + 3 = 43
//
//num = 123 / 10 = 12
//
//        📝 Status after Iteration 2:
//
//reversed = 43
//
//num = 12
//
//        🔁 Iteration 3:
//num = 12
//
//digit = 12 % 10 = 2
//
//reversed = 43 * 10 + 2 = 432
//
//num = 12 / 10 = 1
//
//        📝 Status after Iteration 3:
//
//reversed = 432
//
//num = 1
//
//        🔁 Iteration 4:
//num = 1
//
//digit = 1 % 10 = 1
//
//reversed = 432 * 10 + 1 = 4321
//
//num = 1 / 10 = 0
//
//        📝 Status after Iteration 4:
//
//reversed = 4321
//
//num = 0