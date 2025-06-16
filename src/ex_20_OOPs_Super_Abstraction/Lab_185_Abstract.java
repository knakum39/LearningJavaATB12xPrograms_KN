package ex_20_OOPs_Super_Abstraction;

public class Lab_185_Abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();

      // Father f1 = new Father();
    }
}




























class normal{
    //Concrete class - > complete class
}

abstract class Father{
    abstract void loan50k();
    //this is incomplete method, so this class is also incomplete.
}

class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Loan given!!");
    }
}