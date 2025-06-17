package Tasks.june14_Abstract_and_INTERFACE;

//MAX_SPEED is implicitly public static final even if you don’t specify it.
//You cannot change its value—it’s treated as a compile-time constant.

// Interface with a constant
interface SpeedLimit{
    // Constant (implicitly public, static, and final)
    int MAX_SPEED = 120;
}

// Class accessing the constant
class car implements SpeedLimit {
    public void showSpeedLimit(){
        System.out.println("Max speed is:" + MAX_SPEED);
    }
}



public class InterfaceConstants {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.showSpeedLimit();
    }
}
