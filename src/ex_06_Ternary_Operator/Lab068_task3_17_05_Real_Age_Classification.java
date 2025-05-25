package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        int age =6;
        String agegroup = (age<=18)? "Minor": (age>65)?"Senior":"Adult";
        System.out.println(agegroup);
    }
}
