package Tasks.june20_if_else_core_java;

import java.util.Scanner;

public class Valid_triangle_side {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1 = scanner.nextInt();
        System.out.println("Enter side2:");
        int side2 = scanner.nextInt();
        System.out.println("Enter side3:");
        int side3 = scanner.nextInt();

        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
            System.out.println("This is valid triangle");
        }else{
            System.out.println("this is invlaid triangel");
        }

    }
}
