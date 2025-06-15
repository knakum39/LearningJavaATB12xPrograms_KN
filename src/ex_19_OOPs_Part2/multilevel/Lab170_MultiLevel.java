package ex_19_OOPs_Part2.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son Kishan = new Son();
        Kishan.home();
        Kishan.bhk3();
        Kishan.gf();
        Kishan.extra();

        Father f =new Father();
        f.extra();
        f.gf();
        f.home();

        GrandFather Gf = new GrandFather();
        f.home();
        f.gf();

        Son s1 = new Son();
        //Son s2 = new Father();
        Father f1 = new Son(); // Dynamic Dispatch.
        GrandFather gf1 = new Son();
        GrandFather gf2 = new Father();
//        Son s3 = new GrandFather();

    }
}
