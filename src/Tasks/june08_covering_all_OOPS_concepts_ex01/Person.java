package Tasks.june08_covering_all_OOPS_concepts_ex01;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // using 'this'
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    @Override
    public String toString() {
        return "Tasks.june08_covering_all_OOPS_concepts.ex01.Person[name=" + name + ", age=" + age + "]";
        //Tasks.june08_covering_all_OOPS_concepts.ex01.Person[name=Alice, age=20]
    }
}


//toString() is a method defined in the Object class, the parent of all Java classes.
//By default, if you do this:
//Tasks.june08_covering_all_OOPS_concepts.ex01.Student s1 = new Tasks.june08_covering_all_OOPS_concepts.ex01.Student(...);
//        System.out.println(s1);
//It will print something like: Tasks.june08_covering_all_OOPS_concepts.ex01.Student@3f0ee7
//That’s the default toString() output, which includes:
//The class name
//The object's hashcode in memory
//This is not helpful for debugging or logging real object data.

//We override toString() to return a human-readable, meaningful string that shows the contents of the object.
//Example in our program:
//@Override
//public String toString() {
//    return super.toString() + ", Tasks.june08_covering_all_OOPS_concepts.ex01.Student[roll=" + rollNumber + ", grade=" + calculateGrade() + "]";//
//}
//}


