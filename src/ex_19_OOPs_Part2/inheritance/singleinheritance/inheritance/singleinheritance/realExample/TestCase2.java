package ex_19_OOPs_Part2.inheritance.singleinheritance.inheritance.singleinheritance.realExample;

public class TestCase2 extends CommonTOAllTest{
    void runningTC2(){
        startBrowser();
        System.out.println("Running TC 2");
        closeBrowser();
        readExcelFile();
        readDataBaseFile();
    }
}
