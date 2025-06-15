package Tasks.june08_covering_all_OOPS_concepts_ex02;

// Child class: Dog (single inheritance)
class Dog extends Animal {
    private String breed; // Additional field

    public Dog(String breed, String name){
        super(name); // super calls parent constructor
        this.breed = breed; // this sets child's field
    }
    // Getter for encapsulation
    public String getBreed() {
        return breed;
    }

    // Method overriding (same signature as parent)
   @Override
   public void eat() {
       System.out.println(getName() + " the " + breed + " is eating dog food");
   }

   public void fetch(){
       System.out.println(getName() + " the " + breed + "is fetching");
   }

}
