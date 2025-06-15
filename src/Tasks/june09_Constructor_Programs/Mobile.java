package Tasks.june09_Constructor_Programs;

public class Mobile {
    // Fields
    private String brand;
    private double price;

    // Constructor 1: Only brand
    public Mobile(String brand){
        this.brand = brand;
        this.price = 0.0; // default value
    }

    // Constructor 2: Brand and price
    public Mobile(String brand, double price){
        this.brand= brand;
        this.price = price;
    }

    //Display method
    public void display(){
        System.out.println("The brand of Mobile is:" + this.brand);
        System.out.println("The price of Mobile is Rs:"+ this.price);
    }
//or
//    // Display method
//    public void display() {
//        System.out.println("Brand: " + brand);
//        if (price > 0) {
//            System.out.println("Price: $" + price);
//        } else {
//            System.out.println("Price: Not available");
//        }
//    }
//

    // Main method to test the class
    public static void main(String[] args) {
//        Mobile mobile = new Mobile("Samsung", 54000);
//        mobile.display();
//        or
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("iPhone", 79999.99);

        System.out.println("Mobile 1 Details:");
        m1.display();

        System.out.println("\nMobile 2 Details:");
        m2.display();
    }
}
