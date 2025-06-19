package Tasks.june19_if_else;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Leap year logic
        if ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " " + "is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
