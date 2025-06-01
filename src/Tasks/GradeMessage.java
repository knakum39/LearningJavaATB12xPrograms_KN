package Tasks;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, or F): ");
       char grade = scanner.next().toUpperCase().charAt(0);
        String message;

        switch(grade)
        {
            case 'A':
                message ="Excellent";
                break;
            case 'B':
                message = "Very Good";
                break;
            case 'c':
                message = "Good";
                break;
            case 'D':
                message = "Needs Improvement";
                break;
            case 'F':
                message = "Fail";
                break;
            default:
                message = "Invalid grade";
                break;
        }
        System.out.println(message);
        }

    }

//or
//String message = "Invalid grade"; // Initialize with default
//
//switch(grade) {
//        case 'A':
//message = "Excellent";
//        break;
//        case 'B':
//message = "Very Good";
//        break;
//        case 'C':
//message = "Good";
//        break;
//        case 'D':
//message = "Needs Improvement";
//        break;
//        case 'F':
//message = "Fail";
//        // No default needed since initialized
//        }