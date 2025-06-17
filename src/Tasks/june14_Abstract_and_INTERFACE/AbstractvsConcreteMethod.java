package Tasks.june14_Abstract_and_INTERFACE;

// Abstract class
abstract class Parent{
    abstract void show();   // Abstract method (no body)

    // Concrete method (has a body)
    void display(){
        System.out.println("This is display method- This is a concrete method from the abstract class");
    }
}

// Child class extending Parent
class Child extends Parent{
    // Implementing the abstract method
    @Override
    void show(){
        System.out.println("This is child show method-This is the implementation of the abstract method");
    }
}

// Main class to test
public class AbstractvsConcreteMethod {
    public static void main(String[] args) {
        Child child = new Child();
        // Calling the abstract method (now implemented in Child)
        child.show();
        // Calling the concrete method from the abstract class
        child.display();
    }
}
