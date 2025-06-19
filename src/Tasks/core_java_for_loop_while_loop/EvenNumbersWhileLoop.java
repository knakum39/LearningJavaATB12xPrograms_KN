package Tasks.core_java_for_loop_while_loop;

public class EvenNumbersWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // While loop from 1 to 20
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
