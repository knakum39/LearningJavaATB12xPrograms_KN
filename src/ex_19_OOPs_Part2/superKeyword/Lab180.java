package ex_19_OOPs_Part2.superKeyword;

public class Lab180 {
}

class Baseclass {
    public String browser;

    public Baseclass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("change browser not allowed, not a admin");
        }
    }
    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }

    void bhk3(){

    }
class Tectcase1 extends Baseclass{

        public void TC(){

        }

        public Tectcase1(String browser){
            super(browser);
            super.openBrowser();
            super.openBrowser("Chrome");
            super.closeBrowser();
this.TC();//Calling myself
            this.bhk3();
        }
}

}