package Tasks.june08_covering_all_OOPS_concepts_ex01;

public class Student extends Person {
    private int rollNumber;
    private double[] marks;

    // Constructor using super and this
    public Student(String name, int age, int rollNumber, double[] marks) {
        super(name, age); // super: call to base class constructor
        this.rollNumber = rollNumber; // this: current class variable
        this.marks = marks;
    }

    // Method Overloading: calculateGrade
    public double calculateGrade() {
        double sum = 0;
        for (double mark : marks) {
            sum = sum + mark;
            //sum += mark;
        }
        return sum / marks.length;
    }

    public double calculateGrade(double bonus) {
        return calculateGrade() + bonus;
    }

    // Method Overriding: from Tasks.june08_covering_all_OOPS_concepts.ex01.Person class
    @Override
    public void displayDetails() {
        super.displayDetails(); // super: call to base class method
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + calculateGrade());
    }

    @Override
    public String toString() {
        return super.toString() + ", Tasks.june08_covering_all_OOPS_concepts.ex01.Student[roll=" + rollNumber + ", grade=" + calculateGrade() + "]";
    }

    //If we don't use toString() here,That’s the default toString() output, which includes:
    //The class name
    //The object's hashcode in memory.
    //🔴 This is not helpful for debugging or logging real object data.
    // We override toString() to return a human-readable, meaningful string that shows the contents of the object.
}
