package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for(int i=0; i<=50; i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number"+ i);
            }
            else
            {
                System.out.println("Odd number"+ i);
            }
//
//            or
//
//            for (int i = 0; i <= 50; i++) {
//                if (i % 2 == 0) {
//                    continue; // continue means skip
//                }
//                System.out.println("Odd -> " + i);
//            }
        }
    }

}
