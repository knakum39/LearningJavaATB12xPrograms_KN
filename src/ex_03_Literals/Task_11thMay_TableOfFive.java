package ex_03_Literals;
//Task: To print table of 5 using only PrintF function
/*int num = 5;
5*1 =5
5*2=10
        ...
5*10=50*/
public class Task_11thMay_TableOfFive  {
    public static void main(String[] args) {
        int num =5; // The number for which we want the table
        System.out.printf("%d * 1 = %d\n", num, num*1);
        System.out.printf("%d * 2 = %d%n", num, num*2);
        System.out.printf("%d * 3 = %d", num, num*3).println();
        System.out.printf("%d * 4 = %d%n", num, num*4);
        System.out.printf("%d * 5 = %d%n", num, num*5);
        System.out.printf("%d * 6 = %d%n", num, num*6);
        System.out.printf("%d * 7 = %d%n", num, num*7);
        System.out.printf("%d * 8 = %d%n", num, num*8);
        System.out.printf("%d * 9 = %d%n", num, num*9);
        System.out.printf("%d * 10 = %d%n", num, num*10);
    }

}
