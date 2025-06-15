package Tasks.june08_covering_all_OOPS_concepts_ex01;

public class Main {
    public static void main(String[] args) {
        // Create a Tasks.june08_covering_all_OOPS_concepts.ex01.Student object (Object & Class)
        double[] marks = {65, 95, 98, 88};


        Student s1 = new Student("Rishabh", 30, 20, marks);
              //s1.displayDetails();We could use this single line only.
        // but to cover all the oops concept following code must be written.


        // Polymorphism: Tasks.june08_covering_all_OOPS_concepts.ex01.Person reference to Tasks.june08_covering_all_OOPS_concepts.ex01.Student object
        Person p = s1;

        // Method Overriding in action
        p.displayDetails(); // Calls overridden method in Tasks.june08_covering_all_OOPS_concepts.ex01.Student

        // Method Overloading in action
        System.out.println("Grade with bonus: " + s1.calculateGrade(5.0));

         //toString override
        System.out.println(s1);

    }
}


//| Concept                | Where It Appears                                    |
//        | ---------------------- | --------------------------------------------------- |
//        | **Class/Object**       | `Tasks.june08_covering_all_OOPS_concepts.ex01.Student`, `Tasks.june08_covering_all_OOPS_concepts.ex01.Person`, `Tasks.june08_covering_all_OOPS_concepts.ex01.Main` classes                 |
//        | **Single Inheritance** | `Tasks.june08_covering_all_OOPS_concepts.ex01.Student extends Tasks.june08_covering_all_OOPS_concepts.ex01.Person`                            |
//        | **Encapsulation**      | Private fields + getters/setters in `Tasks.june08_covering_all_OOPS_concepts.ex01.Person`        |
//        | **Method Overloading** | `calculateGrade()` with and without bonus           |
//        | **Method Overriding**  | `displayDetails()` and `toString()` in `Tasks.june08_covering_all_OOPS_concepts.ex01.Student`    |
//        | **Polymorphism**       | `Tasks.june08_covering_all_OOPS_concepts.ex01.Person p = new Tasks.june08_covering_all_OOPS_concepts.ex01.Student(...)`                       |
//        | **`this` keyword**     | Refers to current class variables in constructors   |
//        | **`super` keyword**    | Calls base class constructor and overridden methods |

//
//          +----------------------+
//                  |     Person (Class)   | <----- Superclass
//          +----------------------+
//                  | - name: String       |
//        | - age: int           |
//        +----------------------+
//        | +displayDetails()    |  <-- Method (overridden)
//          | +toString()          |
//        +----------------------+
//        ▲
//        |
//        | extends
//        ▼
//        +----------------------+
//        |     Student (Class)  | <----- Subclass
//          +----------------------+
//                  | - rollNumber: int    |
//        | - marks: double[]    |
//        +----------------------+
//        | +calculateGrade()    |
//        | +displayDetails()    |  <-- Overrides Person method
//          | +toString()          |  <-- Overrides Person method
//          +----------------------+
//
//                  ||
//                  ||
//Creates object ▼
//        ┌──────────────────────────────┐
//        │    new Student(...)          │
//        │  (Alice, 20, 101, {85,90...})│
//        └──────────────────────────────┘
//        ▲                  ▲
//        |                  |
//        |                  |
//        |           ┌─────────────┐
//        |           │  Person p   │ ← Reference of type `Person`
//        |           └─────────────┘
//        |
//        ┌─────────────┐
//        │ Student s1  │ ← Reference of type `Student`
//        └─────────────┘

