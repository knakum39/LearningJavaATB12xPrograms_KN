package ex_26_Collection_Framework.List;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        //stack
        //Last In and First out

        Stack s = new Stack();
        s.add("Krishna");
        s.add("Nakum");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Kiya"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));


    }
}
