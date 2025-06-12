package Tasks.SingleInheritanc;

//Definition: One class inherits from one parent class.
//Context: A BaseController class is extended by a UserController class.

public class main_method_SI {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.handleRequest(); // From BaseController
        uc.getUser();       // From UserController

        BaseController bs = new BaseController();
        bs.handleRequest();
    }
}
