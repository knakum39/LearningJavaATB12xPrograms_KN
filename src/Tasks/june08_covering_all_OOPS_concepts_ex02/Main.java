package Tasks.june08_covering_all_OOPS_concepts_ex02;

public class Main {
    public static void main(String[] args) {
        //Create Objects
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Labrador","Sona");

        // Polymorphism: Animal reference to Dog object
        Animal polyDog = new Dog("Poodle", "Max");

        // Method overloading
        animal.makeSound();
        animal.makeSound("grrr");

        // Method overriding and polymorphism
        animal.eat();
        dog.eat();
        polyDog.eat(); // Calls Dog's eat() due to polymorphism

        // Accessing encapsulated fields via getters
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's breed: " + dog.getBreed());

        // Child class method
        dog.fetch();
        // polyDog.fetch(); // Error: Animal reference doesn't know fetch()
    }
}

//Line-by-Line Explanation
//public static void main(String[] args) {
//
//    public: Makes the method accessible anywhere, so the Java Virtual Machine (JVM) can call it to start the program.
//
//    static: The method belongs to the class, not to any instance, so JVM can call it without creating an object.
//
//    void: The method doesn’t return any value.
//
//            main: The name of the method, which the JVM looks for to start execution.
//
//            String[] args: Accepts command-line arguments as an array of strings.
//
//    Animal animal = new Animal("Generic Animal");
//
//    Creates a new Animal object with the name "Generic Animal".
//
//            Dog dog = new Dog("Buddy", "Labrador");
//
//    Creates a new Dog object with the name "Buddy" and breed "Labrador".
//
//            Animal polyDog = new Dog("Max", "Poodle");
//
//    Demonstrates polymorphism: a parent class reference (Animal) points to a child class object (Dog).
//
//    animal.makeSound();
//
//    Calls the makeSound() method on the Animal object, which prints that the animal makes a sound.
//
//            animal.makeSound("grrr");
//
//    Calls the overloaded makeSound(String) method on the Animal object, which prints the specified sound.
//
//    animal.eat();
//
//    Calls the eat() method on the Animal object.
//
//            dog.eat();
//
//    Calls the eat() method on the Dog object (overrides the parent's method).
//
//    polyDog.eat();
//
//    Calls the eat() method on the object referred to by polyDog (which is a Dog), demonstrating polymorphism.
//
//    System.out.println("Dog's name: " + dog.getName());
//
//    Prints the dog's name by calling the getter method.
//
//    System.out.println("Dog's breed: " + dog.getBreed());
//
//    Prints the dog's breed by calling the getter method.
//
//    dog.fetch();
//
//    Calls the fetch() method, which is specific to the Dog class.
//
//}
//
//Closes the main method.
//
//This main method serves as the entry point for the Java program, where execution starts and all the concepts are demonstrated