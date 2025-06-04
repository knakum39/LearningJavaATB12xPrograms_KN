package Tasks;

//Write a program to check given number is Prime or not
// Natural number > 1
// Prime number - a number that is divisible by 1 and itself
//19 => 1 and 19 => Prime Number
//28=>1,2,4,7,14,28 => Not a Prime number

public class PrimeNumber_simple {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;

        if (num > 1) {
            for(int i=0;i<=num;i++) //i
            {
                if(num%i ==0)
                {
                    count++;
                }
                if (count ==2)
                {
                    System.out.println("PrimeNumber");
                }else {
                    System.out.println("Not a PrimeNumber");
                }
            }

        }
        else
        {
            System.out.println("not a prime number");
        }
    }
}
