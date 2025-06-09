package ex_16_Arrays;

public class SecondHighestFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 100, 84, 102};
        int highest = 0;
        int secondHighest = 0;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Second highest number: " + secondHighest);
    }
}
