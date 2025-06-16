package ex_20_OOPs_Super_Abstraction;

public class Lab188_Interface_P2 {
}

class P implements I1,I2 {

    @Override
    public void icm1() {

    }

    @Override
    public void icm2() {

    }

    @Override
    public void icm3() {

    }
}


interface I1{
    void icm1(); //These are incompelte methods i.e abstract methods
    void icm2(); //These are incompelte methods i.e abstract methods
}

interface I2{
    void icm3();
}
