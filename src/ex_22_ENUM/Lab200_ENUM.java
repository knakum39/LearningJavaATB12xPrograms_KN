package ex_22_ENUM;

public class Lab200_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
        System.out.println(APIURLS.google.getUrl());
    }
}

enum Locators {
    page_button("#btn"), page_input("#input1");

    private String locator;

    Locators(String Locator) {
        this.locator = locator;
    }

    String getLocator() {
        return this.locator;
    }
}