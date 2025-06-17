package Tasks.june14_Abstract_and_INTERFACE;

// Interface with default and static method
interface Vehicle{
    // Default method
    default void start(){
        System.out.println("Vehicle started.");
    }

    // Static method
    static void fuelType(){
        System.out.println("Fuel type is Petrol.");
    }
}

// Class implementing the interface
class Car implements Vehicle{
    // No need to override start() unless customizing
}


public class InterfacewithDefaultandStaticMethod {
    public static void main(String[] args) {
        // Create Car object
        Car obj = new Car();
        obj.start(); // Calls default method from interface
        Vehicle.fuelType();
    }
}
