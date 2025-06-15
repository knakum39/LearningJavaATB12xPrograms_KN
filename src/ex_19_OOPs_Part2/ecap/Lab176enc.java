package ex_19_OOPs_Part2.ecap;

public class Lab176enc {
    public static void main(String[] args) {

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin","pass123");
//        System.out.println(vwoLogin1.password); //make your attribute private
//        System.out.println(vwoLogin1.username);
        System.out.println(vwoLogin1.getUsername());
        System.out.println(vwoLogin1.getPassword());
        vwoLogin1.setUsername("Krishna");
        System.out.println(vwoLogin1.getUsername());
       // vwoLogin1.setPassword("asbn@123",false);
        vwoLogin1.setPassword("asbn@123",true);
        System.out.println(vwoLogin1.getPassword());

    }
}

class GoodVWOLogin {
    private String _username;
    private String _password;

    public GoodVWOLogin(String username, String password) {
        _username = username;
        _password = password;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String username) {
        _username = username;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            _password = password;
        } else {
            System.out.println("Not allowed Set the password, Not a admin!");
        }
    }
}