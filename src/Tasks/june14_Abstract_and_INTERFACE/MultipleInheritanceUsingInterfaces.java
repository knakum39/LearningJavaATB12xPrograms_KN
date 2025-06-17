package Tasks.june14_Abstract_and_INTERFACE;

// Interface 1
interface Printable {
    void print(); // abstract method
}

// Interface 2
interface Showable {
    void show(); // abstract method
}

// Class implementing both interfaces
class Document implements Printable, Showable {

    // Implementing print() method from Printable
    public void print() {
        System.out.println("Printing the document");
    }

    // Implementing show() method from Showable
    public void show() {
        System.out.println("Showing the document");
    }

}

public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Document obj = new Document();
        obj.print();
        obj.show();
    }
}
