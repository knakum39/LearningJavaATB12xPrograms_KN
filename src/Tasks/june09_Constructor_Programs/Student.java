package Tasks.june09_Constructor_Programs;

public class Student {

    public static void main(String[] args) {
        Student s1 = new Student("Rishabh",31);
        s1.display();
    }

    // Fields
        private String name;
        private int age;

        // Constructor
    public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Display method
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }