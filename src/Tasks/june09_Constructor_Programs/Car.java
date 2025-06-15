package Tasks.june09_Constructor_Programs;

public class Car {
    // Fields
    private String brand_name;
    private String model;
    private double price;

    // Constructor
    public Car(String brand_name, String model, double price)
    {
        this.brand_name = brand_name;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void display(){
        System.out.println("Brand name of car is:" + this.brand_name);
        System.out.println("Model of car is:" + this.model);
        System.out.println("Price of car is:" + this.price);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 25000.00);
//        System.out.println(car.brand_name);
//        System.out.println(car.model);
//        System.out.println(car.price);
        // no need to write sout statement again as we have already written in display method.
        //So just call display method here..
        car.display();
    }
}
