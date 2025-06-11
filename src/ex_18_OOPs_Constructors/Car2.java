package ex_18_OOPs_Constructors;

public class Car2 {

    String model;
    int year;

    Car2(){
        model = "XXX";
        year = 1900;
        System.out.println("DC");
    }

    Car2(String model_nmae,int year_created){
        this.model = model_nmae;
        this.year = year_created;
    }

}
