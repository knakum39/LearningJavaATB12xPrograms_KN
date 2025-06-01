package Tasks;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int days = 0;
        boolean isLeapYear = false;

        // Check for leap year (divisible by 4, not by 100 unless also by 400)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days =30;
                break;
            case 2:
                days = isLeapYear ? 29: 28;
                break;
}
        System.out.printf("Month %d in year %d has %d days.%n", month, year, days);
    }
}
