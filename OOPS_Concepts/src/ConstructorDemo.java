/*------------------------------------------------------------
ST. JOSEPH’S COLLEGE OF ENGINEERING AND TECHNOLOGY, PALAI
Department of Computer Science and Engineering

Title       : Java Constructors – No-Args, Parameterized
Date        : [Insert Date Here]
Course Code : [Insert Course Code Here]
Course Name : Object Oriented Programming in Java (OOPJ)
Faculty     : [Your Name]
Target      : Second Year B.Tech Students
------------------------------------------------------------*/
class Books{
	String title;
	String author;
	double price;
	Books(){
		title= "Unknown";
		author = "Not Assigned";
		price = 0.0;
	}
	public void displayDetails() {
		System.out.println("Title:\t"+title);
		System.out.println("Author:\t"+author);
		System.out.println("Price:\t"+price);
	}
}

public class ConstructorDemo {
	public static void main(String [] args) {
		Books book = new Books();
		book.displayDetails();
		book.title="Ram";
		book.displayDetails();
		Books book1 = new Books();
		book1.displayDetails();
	}

}
