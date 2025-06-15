package Tasks.june08_covering_all_OOPS_concepts_ex02;

public class Animal {
    private String name; // Encapsulation: private field

    // Constructor with this keyword
    public Animal(String name){
        this.name = name; // this refers to current object
    }
    // Getter for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method overloading (same name, different parameters)
    public void makeSound(){
        System.out.println(name + " makes a sound");
    }

    public void makeSound(String sound){
        System.out.println(name + " Says: " + sound);
    }

    // Method to be overridden in subclass(child class)
    public void eat() {
        System.out.println(name + " is eating");
    }
}
