package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Rishabh d = new Nahata(); // Dynamic Dispatch will Interface
        Nahata d1 = new Nahata(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}

class Nahata implements Rishabh{


    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Rishabh{
    int a = 10;
    void display();
}