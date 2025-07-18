/*------------------------------------------------------------
ST. JOSEPH’S COLLEGE OF ENGINEERING AND TECHNOLOGY, PALAI
Department of Computer Science and Engineering

Title       : Parameterized Constructor in Java 
Date        : 18-07-2025
Course Code : 24SJPBCST304
Course Name : Object Oriented Programming in Java (OOPJ)
Faculty     : Prof. Sarju S
Target      : Second Year B.Tech Students
------------------------------------------------------------*/
class Student {
    String name;
    int rollNumber;
    String course;

    // Parameterized Constructor
    Student(String studentName, int roll, String courseName) {
        name = studentName;
        rollNumber = roll;
        course = courseName;
    }

    // Method to display student details
    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		// Creating student object using parameterized constructor
        Student student1 = new Student("Rahul", 101, "Computer Science");

        // Display student details
        student1.displayStudentInfo();
		
	}

}
