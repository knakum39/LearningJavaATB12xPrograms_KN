package Tasks.core_java_for_loop_while_loop;

public class EvenNumbers {
    public static void main(String[] args) {
        // Loop from 1 to 20
        for(int i=1; i<=20; i++){
            // Check if the number is even
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
