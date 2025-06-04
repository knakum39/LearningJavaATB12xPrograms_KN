package Tasks;

import java.util.Scanner;

public class CheckArmsrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum =0;
        int backup = num;

    while(num>0){
        sum = sum + (num%10)* (num%10)* (num%10);//sum + cube of the digit
        System.out.println(num%10);
        num = num/10;
    }
        System.out.println(sum);
        System.out.println(num);
    if(sum==backup)
    {
        System.out.println("Armstrong");
    }else{
        System.out.println("Not Armstrong");
    }

    }
}
