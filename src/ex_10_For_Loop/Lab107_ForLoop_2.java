package ex_10_For_Loop;

public class Lab107_ForLoop_2 {
    public static void main(String[] args) {
        //We generally not use ling and float in for loop - We mostly use int only with for loop
        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }

    }
}