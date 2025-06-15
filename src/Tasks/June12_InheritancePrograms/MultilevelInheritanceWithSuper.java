package Tasks.June12_InheritancePrograms;

// Grandparent class
class Grandpar {
    public void showInfo() {
        System.out.println("I am the Grandparent.");
    }
}

// Parent class extends Grandparent
class Par extends Grandpar {
    @Override
    public void showInfo() {
        super.showInfo(); // Call Grandparent's method
        System.out.println("I am the Parent.");
    }
}

// Child class extends Parent
class Chil extends Par {
    @Override
    public void showInfo() {
        super.showInfo(); // Call Parent's method (which also calls Grandparent's)
        System.out.println("I am the Child.");
    }
}

// Main class
public class MultilevelInheritanceWithSuper {
    public static void main(String[] args) {
        Chil child = new Chil();
        child.showInfo();  // Calls overridden method in Child
    }
}
