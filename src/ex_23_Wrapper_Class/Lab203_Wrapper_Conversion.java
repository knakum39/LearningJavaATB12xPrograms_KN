package ex_23_Wrapper_Class;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args) {
        int a=10;
        Integer b = a; //Boxing -> Integer - AutoBoxing - JVM will do it.
        System.out.println(a);
        System.out.println(b.intValue());

        //UnBoxing
        Integer aa = 43;
        int a1 = aa;
        System.out.println(a1);
        System.out.println();

    }
}
