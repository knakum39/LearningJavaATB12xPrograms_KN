package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
         String input = "Krishna";

         for(int i= input.length()-1;i>=0;i--)
         {
             System.out.println(input.charAt(i));
         }
        System.out.print("");

         StringBuffer sb = new StringBuffer(input);
        System.out.print(sb.reverse());
    }

}
