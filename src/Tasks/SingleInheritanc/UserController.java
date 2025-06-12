package Tasks.SingleInheritanc;

public class UserController extends BaseController {
    BaseController bs =new BaseController();

    public void getUser() {
        System.out.println("Getting user");
    }
}
