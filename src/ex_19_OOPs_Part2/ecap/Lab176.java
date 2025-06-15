package ex_19_OOPs_Part2.ecap;

public class Lab176 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","pass123");
        vwoLogin.password ="654";
        System.out.println(vwoLogin.password);

    }

}

// Without encapsulation
class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

