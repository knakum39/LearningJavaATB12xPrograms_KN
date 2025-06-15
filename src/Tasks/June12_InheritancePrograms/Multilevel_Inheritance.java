package Tasks.June12_InheritancePrograms;

// Grandparent class
class Grandparent{
    public void showGrandparent() {
        System.out.println("I am the Grandparent.");
    }
}

// Parent class inherits Grandparent
class Parent extends Grandparent {
    public void showParent() {
        System.out.println("I am the Parent.");
    }
}

// Child class inherits Parent (and indirectly Grandparent)
class Child extends Parent{
    public void showChild(){
        System.out.println("I am the child");
    }
}

// Main class to run the program
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();

        // Call methods from all three classes
        child.showGrandparent();  // Inherited from Grandparent
        child.showParent();       // Inherited from Parent
        child.showChild();        // Own method
    }
}
