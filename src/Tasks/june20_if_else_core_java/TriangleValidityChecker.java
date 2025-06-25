package Tasks.june20_if_else_core_java;

public class TriangleValidityChecker {
    public static void main(String[] args) {
        // Example side lengths
        int a = 5;
        int b = 7;
        int c = 10;

// Check if the triangle is valid
        if (isValidTriangle(a, b, c)) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do NOT form a valid triangle.");
        }
    }

        // Method to check triangle validity
        public static boolean isValidTriangle(int a, int b, int c) {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }
    }

