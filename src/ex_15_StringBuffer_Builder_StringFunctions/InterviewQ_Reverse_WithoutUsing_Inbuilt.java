package ex_15_StringBuffer_Builder_StringFunctions;
//- Write a program to reverse a string without using inbuilt functions. -> forloop
//- Write a program to reverse a string by using an inbuilt function.  -> StringBuffer - reverse()

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
         String input = "Krishna";

         for(int i= input.length()-1;i>=0;i--)
         {
             System.out.print(input.charAt(i));
         }
        System.out.print(" ");

         StringBuffer sb = new StringBuffer(input);
        System.out.print(sb.reverse());
    }

}

//for(int i = input.length() - 1; i >= 0; i--)
//This is a for loop that will iterate in reverse.
//
//        input.length() returns 7 because "Krishna" has 7 characters.
//
//        input.length() - 1 = 6, so the loop starts at index 6 (which is the last character 'a').
//
//i >= 0 → The loop stops when i becomes less than 0.
//
//i-- → After every loop iteration, i is decreased by 1, moving from right to left.
//Inside the loop, input.charAt(i) returns the character at the current index i.
//
//        System.out.print() prints the character without a newline, so all characters print on the same line.
//
//As i goes from 6 to 0, it prints characters in reverse order.