package Tasks.june14_Abstract_and_INTERFACE;

// Abstract class
abstract class MyAbstractClass {
    // Constructor
    MyAbstractClass() {
        System.out.println("Abstract class constructor called.");
    }

    // Concrete method
    void showMessage() {
        System.out.println("Method from abstract class.");
    }
}

// Subclass that extends abstract class
class ConcreteClass extends MyAbstractClass {
    // No additional implementation needed
}

public class AbstractClasswithConstructor {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass(); // Constructor called
        obj.showMessage(); // Method called
    }
}
