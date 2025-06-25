package Tasks.june20_if_else_core_java;

import java.util.Scanner;

public class ATMWithdrawalSimulation {
    public static void main(String[] args) {

        final double account_balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw ");
        int amount = scanner.nextInt();

       double updated_balance;

        if(amount >0 && amount % 100 == 0 && amount <= account_balance ){
            updated_balance = account_balance - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Updated balance is ₹" + updated_balance);
        }
        else {
            System.out.println("Withdrawal failed.");
            if (amount <= 0) {
                System.out.println("Amount must be greater than 0.");
            } else if (amount % 100 != 0) {
                System.out.println("Amount must be a multiple of 100.");
            } else if (amount > account_balance) {
                System.out.println("Insufficient balance.");
            }
        }
        scanner.close();
    }

}
