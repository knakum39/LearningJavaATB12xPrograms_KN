package Tasks.core_java_for_loop_while_loop;

public class MultiplicationTableWhile {
    public static void main(String[] args) {
        int num =7;
        int i = 1;

        while(i <=10){
            System.out.printf("%d x %d = %d%n", num, i, num*i);
            //System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}


