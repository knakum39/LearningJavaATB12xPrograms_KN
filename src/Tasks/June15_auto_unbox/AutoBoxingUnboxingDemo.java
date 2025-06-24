package Tasks.June15_auto_unbox;

public class AutoBoxingUnboxingDemo {

    public static void main(String[] args) {

        // Autoboxing: primitive int to Integer object
        int primitiveInt = 10;
        Integer boxedInt = primitiveInt; // Java automatically boxes the int

        // Unboxing: Integer object to primitive int
        Integer anotherBoxedInt = 20;
        int unboxedInt = anotherBoxedInt; // Java automatically unboxes the Integer

        // Output the results
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Another Boxed Integer: " + anotherBoxedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // Using in collections (which require objects, not primitives)
//        java.util.List<Integer> intList = new java.util.ArrayList<>();
//        intList.add(5);  // autoboxing
//        int x = intList.get(0); // unboxing
//        System.out.println("Value from List (autoboxed and unboxed): " + x);
    }
}
