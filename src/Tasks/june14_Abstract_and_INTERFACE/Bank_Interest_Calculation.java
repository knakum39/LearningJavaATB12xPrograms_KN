package Tasks.june14_Abstract_and_INTERFACE;


// Abstract class
abstract class Bank {
    // Abstract method
    abstract double getInterestRate();
}

// SBI class extends Bank
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

// HDFC class extends Bank
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

// Main class to test
public class Bank_Interest_Calculation {
    public static void main(String[] args) {
        Bank sbi = new SBI();//dynamic dispatch
        Bank hdfc = new HDFC();//dynamic dispatch
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
//        System.out.println(sbi.getInterestRate());
//        System.out.println(hdfc.getInterestRate());
    }
}