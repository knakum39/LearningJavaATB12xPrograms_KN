package Tasks;

public class reverse_number_while {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;          // Step 1: Get last digit
            reversed = reversed * 10 + digit; // Step 2: Append digit to reversed
            num = num / 10;               // Step 3: Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}

//For 1234:
//
//Take 1234 % 10 → 4 (last digit)
//
//Add 4 to reversed number: rev = rev * 10 + digit → rev = 0 * 10 + 4 = 4
//
//Remove the last digit from 1234: 1234 / 10 = 123
//
//Repeat the process for 123, then 12, then 1, then 0