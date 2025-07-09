/*******************************************************
 * Title      : Java Program – Grade Description Using String Switch
 * Author     : Sarju S
 * Date       : 09/07/2025
 * Description: This Java program uses a switch statement 
 *              with String values to display grade descriptions 
 *              based on the 2024 B.Tech grading system.
 *******************************************************/

public class SwitchWithString {
    public static void main(String[] args) {
        String grade = "A+";
        switch (grade) {
            case "O":
                System.out.println("Outstanding Performance");
                break;
            case "A+":
                System.out.println("Excellent Performance");
                break;
            case "A":
                System.out.println("Very Good Performance");
                break;
            case "B+":
                System.out.println("Good Performance");
                break;
            case "B":
                System.out.println("Above Average Performance");
                break;
            case "C":
                System.out.println("Average Performance");
                break;
            case "P":
                System.out.println("Pass");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
