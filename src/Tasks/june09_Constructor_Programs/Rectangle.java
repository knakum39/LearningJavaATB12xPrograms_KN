package Tasks.june09_Constructor_Programs;

public class Rectangle {
    // Fields
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area
    public void displayArea() {
        double area = length*breadth;
        System.out.println("Length of rectangle is: : " + length);
        System.out.println("Breadth of rectangle is:: " + breadth);
        System.out.println("Area of rectangle is:" + area);
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.5,14);
        rectangle.displayArea();
    }
}
