package ex_19_OOPs_Part2.inheritance.Poly.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Kishan k = new Kishan();
        k.k1();
        k.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Kishan(); //jeno object chhe e call thase..ahiya kishan no object chhe so 3bhk call thase..
        f2.home();
    }
}
