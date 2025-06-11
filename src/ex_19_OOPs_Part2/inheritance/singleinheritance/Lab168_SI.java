package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {

        Son kishan = new Son();
        System.out.println(kishan.gold_f);
        kishan.bhk3();
        kishan.bhk2();

        Cousin c = new Cousin();
        c.bhk4();
        //System.out.println(c.gold_f);
    }
}
