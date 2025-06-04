package Tasks;

import java.util.Scanner; //This imports the Scanner class so we can take input from the user through the keyboard.


//Enter the number of terms: 7
//Fibonacci Series up to 7 terms:
//        0 1 1 2 3 5 8

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Creates a Scanner object called scanner to read user input from the console.
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();// Reads the number entered by the user and stores it in variable n.
        int first=0,second = 1;//✅ Initializes the first two terms of the Fibonacci series: 0 and 1.

        for(int i=1; i<= num;i++){//Starts a loop that runs from 1 to n (inclusive) — so it prints n numbers in total.
            System.out.println(first + " ");//Prints the current first value (starts with 0) and adds a space after it.
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("Fibonacci Series up to " + num + " terms:");

    }
}
