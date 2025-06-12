package Tasks.HierarchicalInheritance;

//Definition: Multiple classes inherit from a single parent class.
//Context: BaseController is extended by both UserController and ProductController.

public class mainclass {
    public static void main(String[] args) {

        UserController uc = new UserController();
        uc.handleRequest();
        uc.getUser();

       ProductController pc = new ProductController();
       pc.handleRequest();
       pc.getProduct();
       pc.getUser();


    }
}
