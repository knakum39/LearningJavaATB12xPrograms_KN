package Tasks.june14_Abstract_and_INTERFACE;

// Interface
interface Playable{
    void play();
}

// Class implementing Playable
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing Guitar.");
    }
}

// Another class implementing Playable
class Piano implements Playable{
    public void play(){
        System.out.println("Playing Piano.");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        // Interface reference
        Playable instrument;

        // Assign Guitar object
       instrument = new Guitar();
        instrument.play();  // Output: Playing Guitar

        // Assign Piano object
        instrument = new Piano();
        instrument.play();  // Output: Playing Piano
    }
}


//✅ Step-by-Step Explanation:
//        1. Declaration of Interface Reference

//Playable instrument;
//You declare a variable instrument of type interface Playable.
//This variable can hold any object that implements Playable, like Guitar or Piano.

//        2. Assign a Guitar Object
//        instrument = new Guitar();
//Now, instrument refers to a Guitar object.
//Even though the reference is of type Playable, Java will call the Guitar class’s play() method.

//instrument.play();  // Output: Playing Guitar

//3. Assign a Piano Object
//        instrument = new Piano();
//You reassign instrument to a Piano object.
//
//        Again, Java uses dynamic method dispatch to call the correct play() implementation from Piano.
//instrument.play();  // Output: Playing Piano
//💡 Why This Is Polymorphism:
//One interface reference (Playable instrument) is used to call different method implementations at runtime.
//Java decides which method to run based on the actual object (Guitar or Piano), not the reference type.
