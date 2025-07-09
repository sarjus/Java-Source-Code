/*******************************************************
 * Title      : 2024 B.Tech Scheme – Grade Evaluation
 * Author     : Sarju S
 * Date       : 09/07/2025
 * Description: Java program to evaluate and display grade
 *              based on 2024 B.Tech grading scheme
 *              using if-else if-else statements.
 *******************************************************/

public class MarkGradingSystem {

	public static void main(String[] args) {
		int marks = 78; // You can change this value to test
        if (marks >= 90) {
            System.out.println("Grade: O (Outstanding)");
        } else if (marks >= 80) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (marks >= 70) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: B+ (Good)");
        } else if (marks >= 50) {
            System.out.println("Grade: B (Above Average)");
        } else if (marks >= 45) {
            System.out.println("Grade: C (Average)");
        } else if (marks >= 40) {
            System.out.println("Grade: P (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
	}
}
