package ex_19_OOPs_Part2.ecap;

public class Lab177 {
    public static void main(String[] args) {
        ICICIBank jiya = new ICICIBank("Jiya", 100);
        System.out.println(jiya.getBal());
        System.out.println(jiya.bank_name);

        boolean isCashier = false;
        jiya.setBal(480, isCashier);
//        or
//        jiya.setBal(500, true);

        System.out.println(jiya.getBal());

    }
}

class ICICIBank {

    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;
    public String bank_name = "ICICI";

    public ICICIBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier){
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }

    }
}