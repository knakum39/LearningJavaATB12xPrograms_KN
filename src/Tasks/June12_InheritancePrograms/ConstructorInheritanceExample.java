package Tasks.June12_InheritancePrograms;

// Parent class
class Animal1 {
    public Animal1() {
        System.out.println("Animal constructor called.");
    }
}

// Child class
class Dog1 extends Animal1 {
    public Dog1() {
        super(); // Optional, added automatically if omitted
        System.out.println("Dog constructor called.");
    }
}

// Main class
public class ConstructorInheritanceExample {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
    }
}