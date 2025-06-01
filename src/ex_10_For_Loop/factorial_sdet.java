package Tasks;

import java.util.Scanner;

public class factorial_sdet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial =1;

        if(number<0)
        {
            System.out.println("Factorial of -n is not possible");
        }
        else
        {
            for(int i=1; i<=number;i++)
            {
                factorial = factorial *i;
            }
            System.out.println("Factorial of "+ number + " is " +factorial);
        }
    }
}