package ex_06_Ternary_Operator;

public class Lab067_task2_17_05_To_Three_Max {
    public static void main(String[] args) {
        int n1=1089;
        int n2= 5200;
         int n3=110;
         String max_no = (n1>n2)?((n1>n3)?"n1 is the max number":"n3 is the max number") :"n2 is the max number";
        System.out.println(max_no);

        //Another way
        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program
        //
//        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
//        System.out.println(max);

    }
}
