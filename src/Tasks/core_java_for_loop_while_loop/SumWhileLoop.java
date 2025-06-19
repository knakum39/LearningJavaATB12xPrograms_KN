package Tasks.core_java_for_loop_while_loop;

public class SumWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 10 natural number is:"+ sum);
    }
}
