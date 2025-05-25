package ex_04_Operators;

import javax.xml.transform.stream.StreamSource;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {

// < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_krishna = 32;
        int age_rishabh = 29;
        boolean result = age_krishna >= age_rishabh;
        System.out.println(result);

        // age_krishna > age_rishabh or age_krishna = age_rishabh
    }
}
