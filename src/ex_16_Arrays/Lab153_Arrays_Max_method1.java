package ex_16_Arrays;

public class Lab153_Arrays_Max_method1 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 118, 29, 49};
        int max_number = max_element(array);
        System.out.println("Max is," + max_number);

    }

    static int max_element(int[] array){
        int max = array[0];

        //logic
        for(int i=0; i<array.length; i++){
            if(array[i]> max){
                max = array [i];
            }
        }
        return max;
    }
}