package JavaProgrammingAssessment_Coding_challenges;

public class ComparisonLogicalOperator {
    public static void main(String[] args) {

        int a=10;
        int b = 20;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a < b: " + (a < b));    // true
        System.out.println("a > b: " + (a > b));    // false
        System.out.println("a <= b: " + (a <= b));  // true
        System.out.println("a >= b: " + (a >= b));  // false

        // Logical Operators
        boolean condition1 = (a<b);
        boolean condition2 = (a>6);

        System.out.println("\nLogical Oprators:");
        System.out.println("Condition1 && condition2:" + (condition1 && condition2));
        System.out.println("Condition1 || condition2:" + (condition1 || condition2));
        System.out.println("!(Condition1):" + (!condition1));
    }
}
