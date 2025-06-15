package Tasks.june09_Constructor_Programs;

public class Book {
    // Fields
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price= price;
    }

    // Method to display book details
    public void display()
    {
        System.out.println("The title of Book is:" + this.title);
        System.out.println("The author of Book is:" + this.author);
        System.out.println("The Price of Book is:$" + this.price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
    Book book = new Book("The wings of Fire", "Dr. APJ abdul kalam", 457.36);
    book.display();
    }
}
