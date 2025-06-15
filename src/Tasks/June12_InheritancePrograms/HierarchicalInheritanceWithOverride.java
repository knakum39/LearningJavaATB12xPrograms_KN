package Tasks.June12_InheritancePrograms;

// Base class
class Vehicle1 {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Derived class 1
class Car1 extends Vehicle1{
    @Override
    public void start() {
        //super.start();
        System.out.println("Car is starting with a key ignition.");
    }
    public void carFeature() {
        System.out.println("Car has 4 wheels and AC.");
    }
}

// Derived class 2
class Bike1 extends Vehicle1{
    @Override
    public void start(){
        System.out.println("Bike is starting with a kick or self-start.");
    }

    public void bikeFeature() {
        System.out.println("Bike has 2 wheels and is fuel efficient.");
    }
}

// Main class
public class HierarchicalInheritanceWithOverride {
    public static void main(String[] args) {
        // Creating a Car object
        Car1 car = new Car1();
        car.start();         // Overridden method in Car
        car.carFeature();    // Car-specific method

        System.out.println();

        // Creating a Bike object
        Bike1 bike = new Bike1();
        bike.start();        // Overridden method in Bike
        bike.bikeFeature();  // Bike-specific method
    }
}
