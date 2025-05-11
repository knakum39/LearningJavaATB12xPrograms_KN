package ex_01_Java_Basics;

public class Lab003_No_Main_Method {
    /*We can write such program that don't have main method, but it will never run.
    JVM never recognize such program that don't have main method */

/*    Significance of Each Keyword:
    public: The method must be accessible from outside the class so the JVM can invoke it.
    static: No object is needed to call the method; the JVM can call it directly using the class name.
    void: The method doesn't return any value.
    main: This is the name recognized by the JVM as the starting point.

    String[] args: This allows command-line arguments to be passed to the program.

    Why is it important?
    Without the main method, a Java application will not run unless it's a web app (with servlets), Android app, or something running in a managed environment like JUnit tests.
    Would you like a working example showing how command-line arguments are used?*/
}
