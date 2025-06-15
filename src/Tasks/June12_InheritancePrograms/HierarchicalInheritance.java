package Tasks.June12_InheritancePrograms;

// Base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Derived class 1
class Car extends Vehicle {
    public void carFeature() {
        System.out.println("Car has 4 wheels and AC.");
    }
}

// Derived class 2
class Bike extends Vehicle {
    public void bikeFeature() {
        System.out.println("Bike has 2 wheels and is fuel efficient.");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car();
        car.start();         // Inherited from Vehicle
        car.carFeature();    // Specific to Car

       System.out.println();

        // Creating a Bike object
        Bike bike = new Bike();
        bike.start();        // Inherited from Vehicle
        bike.bikeFeature();  // Specific to Bike
    }
}
