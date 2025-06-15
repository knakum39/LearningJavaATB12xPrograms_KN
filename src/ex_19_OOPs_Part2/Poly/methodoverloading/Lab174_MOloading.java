package ex_19_OOPs_Part2.Poly.methodoverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
//        m1.add(3,4);
//        m1.add(3,5,6);
//        m1.add(3.48,69.36);

        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);


        double r0 = m1.add(3.34,4.56);
        System.out.println(r1);

    }
}
