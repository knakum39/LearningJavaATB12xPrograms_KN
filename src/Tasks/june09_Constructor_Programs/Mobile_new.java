package Tasks.june09_Constructor_Programs;

//New Requirement: Let's expand your Mobile class to include:
//Add model and storage (in GB)
//Use constructor overloading to allow different combinations:
//Constructor 1: Only brand
//Constructor 2: brand + price
//Constructor 3: brand + model + price + storage

public class Mobile_new {
    // Fields
    private String brand;
    private String model;
    private double price;
    private int storage; // in GB

    // Constructor 1: Only brand
    public Mobile_new(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.price = 0.0;
        this.storage = 0;
    }

    // Constructor 2: Brand and price
    public Mobile_new(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.model = "Unknown";
        this.storage = 0;
    }

    // Constructor 3: Brand, model, price, and storage
    public Mobile_new(String brand, String model, double price, int storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    // Display method
    public void display() {
        System.out.println("Brand   : " + this.brand);
        System.out.println("Model   : " + this.model);
        System.out.println("Price   : Rs." + this.price);
        System.out.println("Storage : " + this.storage + "GB");
        System.out.println("------------------------------");
    }

    // Main method to test all constructors
    public static void main(String[] args) {
        Mobile_new m1 = new Mobile_new("Samsung");
        Mobile_new m2 = new Mobile_new("iPhone", 8499);
        Mobile_new m3 = new Mobile_new("OnePlus", "Nord CE 3 Lite", 19999, 128);

        m1.display();
        m2.display();
        m3.display();

    }
}
