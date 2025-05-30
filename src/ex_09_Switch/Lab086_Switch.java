package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {
        System.out.println("Enter any day from 1-7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
        }
    }
}
