package Tasks.june14_Abstract_and_INTERFACE;

// Main class to test
public class Animal_Sound {
    public static void main(String[] args) {

        Animal dog = new Dog(); //Dynamic Dispatch
        Animal cat = new Cat();//Dynamic dispatch
        dog.makeSound(); // Expected: Dog barks
        cat.makeSound(); // Expected: Cat meows
    }
}

// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();
}

// Dog class extends Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}