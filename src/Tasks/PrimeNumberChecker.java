package Tasks;
//Write a program to check given number is Prime or not
// Prime number - a number that is divisible by 1 and itself


import java.util.Map;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <=1) {
            isPrime = false;
        }
        else {
                for (int i =2 ; i <= Math.sqrt(num); i++){
                if(num % i ==0){
                    isPrime = false;
                    break;
                }

            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number.");
        }else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}
