package Tasks;

public class OddEvenFromArray {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 4, 15, 20, 33, 2};

        System.out.println("Even numbers in the array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nOdd numbers in the array:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

//public class OddEvenFromArray {
//    public static void main(String[] args) {
//        int[] numbers = {12, 7, 9, 4, 15, 20, 33, 2};
//
//        System.out.println("Classifying numbers as Even or Odd:\n");
//
//        for (int num : numbers) {
//            if (num % 2 == 0) {
//                System.out.println(num + " is Even");
//            } else {
//                System.out.println(num + " is Odd");
//            }
//        }
//    }
//}