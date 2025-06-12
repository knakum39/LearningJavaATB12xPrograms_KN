package Tasks.MultilevelInheritance;
//Multilevel Inheritance
//Definition: A class inherits from a child class which itself inherits from another class.
//Context: BaseController → AuthController → AdminController.
//
public class mainclass {
    public static void main(String[] args) {
        AdminController ac = new AdminController();
        ac.handleRequest();       // From BaseController
        ac.authenticate();        // From AuthController
        ac.manageAdminTasks();    // From AdminController

    }

}
