package ex_19_OOPs_Part2.inheritance.Poly.methodoverriding;

public class REALExample {
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.openBrowser();
    }
}

class CommonToAllTC{
    void openBrowser(){
        System.out.println("Open the browser!");
    }
}

class TC_Chrome extends CommonToAllTC{
    @Override
    void openBrowser(){
        System.out.println("Starting a chrome");
        //new ChromeDriver();
    }
}
//Overriding parent-child relations must have, both must have same method name and same parameters in differant classes.
//Overloading: parent -child relation not necessary : same method name but differant parameter within the same classs