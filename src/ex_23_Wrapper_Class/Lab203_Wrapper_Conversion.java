package ex_23_Wrapper_Class;

public class Lab203_Wrapper_Conversion {

    public static void main(String[] args) {
        String num = "10";
        int aa = 10;

        // String -> Wrapper Conversion
        Integer a = Integer.parseInt(num); //(parseX()
        // Double.parseDouble(), Float.parseFloat();

        // String to Primitive
        int a_p = Integer.parseInt(num); // (String -> WP, WP -> primitve unboxing)

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);


        Integer aa10 = 10;
        String s = aa10.toString();
        System.out.println(s);
        System.out.println(s instanceof String);

//## Summary of Concepts Demonstrated:
//        Parsing: String → int (primitive) using Integer.parseInt().
//        Autoboxing: int → Integer automatically.
//        Unboxing: Integer → int automatically (not directly shown, but implied).
//        Wrapper Conversion: Using valueOf() to get an Integer from a String.
//        Wrapper to String: Using .toString() to get a string from a wrapper object.

//instanceof operator: To check runtime object type.
    }
}