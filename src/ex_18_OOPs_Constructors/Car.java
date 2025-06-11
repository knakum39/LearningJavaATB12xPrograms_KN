package ex_18_OOPs_Constructors;

public class Car {
    String name;
    String model;
    int year;

    // Default Constructor

    Car() {
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("DC");
    }
}
