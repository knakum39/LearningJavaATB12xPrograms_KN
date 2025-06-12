package ex_19_OOPs_Part2.inheritance.Poly.methodoverriding;

public class Kishan extends Father{
    @Override
    void f1() {
        super.f1();
    }

    void home() {
        System.out.println("Kishan - 3BHK");
    }
    void k1(){
        System.out.println("Kishan - k1");
    }

}
