package ex_03_Literals;

public class Task_11thMay_TableOfSix {
    public static void main(String[] args) {
        int num =6;
        System.out.printf("%d * 1 = %d%n",num,num*1);
        System.out.printf("%d * 2 = %d%n",num,num*2);
        System.out.printf("%d * 3 = %d%n",num,num*3);
        System.out.printf("%d * 4 = %d%n",num,num*4);
        System.out.printf("%d * 5 = %d%n",num,num*5);
        System.out.printf("%d * 6 = %d%n",num,num*6);
        System.out.printf("%d * 7 = %d%n",num,num*7);
        System.out.printf("%d * 8 = %d%n",num,num*8);
        System.out.printf("%d * 9 = %d%n",num,num*9);
        System.out.printf("%d * 10 = %d%n",num,num*10);
    }
}

/*
Alternative (Using Loop)
(If you later want a dynamic solution, use this:)

java
public class TableOfFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("5 x %d = %d%n", i, 5 * i);
        }
    }
}*/

/*
Line-by-Line Explanation:
        1. Class Declaration

public class TableOfFive {
    Defines a public class named TableOfFive.
    The filename must match this class name (TableOfFive.java).

            2. Tasks.june08_covering_all_OOPS_concepts.ex01.Main Method (Entry Point)

    public static void main(String[] args) {
        The main method is where the program starts executing.
        public: Accessible from anywhere.
        static: Can be called without creating an object.
        void: Returns no value.
                String[] args: Command-line arguments (unused here).

        3. For Loop

        for (int i = 1; i <= 10; i++) {
            Initialization: int i = 1 → Starts the loop with i = 1.
            Condition: i <= 10 → Continues looping while i is ≤ 10.
            Increment: i++ → Increases i by 1 after each iteration.
                    Effect: The loop runs 10 times (for i = 1 to i = 10).

            4. printf() Statement

            System.out.printf("5 x %d = %d%n", i, 5 * i);
            Formatted Output: Uses printf to print a formatted string.

                   %d: Placeholder for integers.
                    First %d → Replaced by i (the multiplier: 1, 2, ..., 10).
            Second %d → Replaced by 5 * i (the result of multiplication).
                    %n: Platform-independent newline (like \n).
*/
