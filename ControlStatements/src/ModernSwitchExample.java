/*******************************************************
 * Title      : ModernSwitchExample – Grade Evaluation Using Java 14+ Switch
 * Author     : Sarju S
 * Date       : 09/07/2025
 * Description: This Java program demonstrates the use of the 
 *              modern switch expression (Java 14 and above) 
 *              to evaluate and display grade descriptions 
 *              based on the 2024 B.Tech grading system.
 *******************************************************/

public class ModernSwitchExample {
    public static void main(String[] args) {
        String grade = "A";

        String result = switch (grade) {
            case "O"  -> "Outstanding Performance";
            case "A+" -> "Excellent Performance";
            case "A"  -> "Very Good Performance";
            case "B+" -> "Good Performance";
            case "B"  -> "Above Average Performance";
            case "C"  -> "Average Performance";
            case "P"  -> "Pass";
            case "F"  -> "Fail";
            default   -> "Invalid Grade";
        };

        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}