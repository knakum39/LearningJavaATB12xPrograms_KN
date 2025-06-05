package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Krishna");
        stringBuffer.append(" Nakum");
        System.out.println(stringBuffer);

        String s1 = "Krishna";
        s1 = s1+ "Nakum";
        System.out.println(s1);


    }
}