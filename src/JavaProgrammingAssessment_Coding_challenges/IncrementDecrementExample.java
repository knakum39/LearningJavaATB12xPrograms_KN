package JavaProgrammingAssessment_Coding_challenges;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original: " + i);

        int r1 = ++i;
        System.out.println("Pre-increment:" + r1);

        int r2 = i++;
        System.out.println("Post-increment:" + r2);

        int r3 = --i;
        System.out.println("Pre-decrement:" + r3);

        int r4 = i--;
        System.out.println("Post-decrement:" + r4);

        System.out.println("i:" + i);
    }
}
