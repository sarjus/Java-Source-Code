/*------------------------------------------------------------
ST. JOSEPH’S COLLEGE OF ENGINEERING AND TECHNOLOGY, PALAI
Department of Computer Science and Engineering

Title       : Java Constructors – No-Args, Parameterized
Date        : 18-07-2025
Course Code : 24SJPBCST304
Course Name : Object Oriented Programming
Faculty     : Prof. Sarju S
Target      : Second Year B.Tech Students
------------------------------------------------------------*/

class Car {
    String brand;
    String model;

    // No-Args Constructor
    Car() {
        brand = "Toyota";
        model = "Corolla";
    }

    // Method to display car info
    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class No_args_constructor {
	public static void main(String[] args) {
		 // Creating car object using no-args constructor
        Car myCar = new Car();

        // Display car info
        myCar.displayCarInfo();

	}

}
