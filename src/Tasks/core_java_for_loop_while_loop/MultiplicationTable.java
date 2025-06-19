package Tasks.core_java_for_loop_while_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;

        // Loop from 1 to 10
        for(int i=1; i<=10; i++)
        {
           // System.out.println(num + "x" + i + "=" + (num * i ));
            System.out.printf ("%d x %d = %d%n", num, i, num * i);
        }
    }
}
