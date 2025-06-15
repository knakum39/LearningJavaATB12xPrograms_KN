package ex_20_OOPs_Super_Abstraction;

public class Lab182_coverallconcepttillnow {
    public static void main(String[] args) {
        Car c1 = new Car(500);
        c1.display();
    }
}

class vehicle{
    public int maxspeed= 180;

    void noTest(){
        System.out.println("Empty!");
    }

    vehicle(){
        System.out.println("Default Constructor");
    }

    vehicle(int a)
    {
        System.out.println("Parametrise Constructor");
    }

    vehicle(int a, int b)
    {
        System.out.println("Parametrise Constructor");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }
    void display(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends vehicle{
   private int maxspeed = 284;

   Car(){
       super(100);
   }
    void test(){}

    Car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("Override of Car!");
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.noTest();
        this.test();
    }
}