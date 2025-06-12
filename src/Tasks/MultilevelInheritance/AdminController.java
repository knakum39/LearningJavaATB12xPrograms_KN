package Tasks.MultilevelInheritance;

// Final child class
public class AdminController extends AuthController {
    public void manageAdminTasks() {
        System.out.println("Managing admin tasks");
    }
}