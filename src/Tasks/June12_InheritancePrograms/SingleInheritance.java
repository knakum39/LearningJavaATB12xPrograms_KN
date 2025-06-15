package Tasks.June12_InheritancePrograms;
// Base class, Parent class, superclass
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class,Child class, subclass
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
        }

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
