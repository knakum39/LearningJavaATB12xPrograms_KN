package Tasks;

import java.util.Arrays;

public class highestnum_array_sort_function {
    public static void main(String[] args) {
        int [] num = {10, 20, 30, 40 , 188, 108};
        Arrays.sort(num);

        System.out.println("highest number in array is:");
        System.out.println(num[num.length - 1]);
    }
}
