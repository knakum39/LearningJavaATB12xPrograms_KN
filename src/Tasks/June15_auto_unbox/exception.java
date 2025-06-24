package Tasks.June15_auto_unbox;

public class exception {
    public static void main(String[] args) {
        int a=12;
        int b = 0;
        try {
            int result = a / b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }

    }
}
