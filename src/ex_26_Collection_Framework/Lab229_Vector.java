package ex_26_Collection_Framework;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("Krishna");
        v.add("Rishabh");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Lucky");
        System.out.println(v.contains("Lucky"));
    }
}
