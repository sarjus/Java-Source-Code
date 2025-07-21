/*------------------------------------------------------------
ST. JOSEPH’S COLLEGE OF ENGINEERING AND TECHNOLOGY, PALAI
Department of Computer Science and Engineering

Title       : Method Overloading
Date        : 21-07-2025
Course Code : 24SJPBCST304
Course Name : Object Oriented Programming in Java (OOPJ)
Faculty     : Sarju S
Target      : Second Year B.Tech Students
------------------------------------------------------------*/

class Shape{
	public void area(float radius) {
		float area = 3.14f*radius*radius;
		System.out.println("Area of Circle = "+ area);
	}
	public void area(int l, int b) {
		int area = l*b;
		System.out.println("Area of Rectangle = "+ area);
	}
	public void area(int a) {
		int area = a*a;
		System.out.println("Area of Square = "+ area);
		
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(3.5f);
		shape.area(5);
		shape.area(6, 5);

	}

}
