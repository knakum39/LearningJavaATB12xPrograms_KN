package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        int r1 = sum_of_two_number( 4,5);
        System.out.println(r1);
        int r2 = sum_of_two_number( 14,51);
        System.out.println(r2);

    }

    static int sum_of_two_number(int first, int second){
        return first+second;
    }
}
