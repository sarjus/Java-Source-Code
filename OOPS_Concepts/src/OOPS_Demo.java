import java.util.Scanner;
class Book{
	String title;
	String author;
	String publisher;
	Book(String publisher){
		this.publisher = publisher;
	}
	Scanner sc  =  new Scanner(System.in);
	public void readBookDetails() {
		System.out.println("Enter the title of the book");
		title = sc.nextLine();
		System.out.println("Enter the Author name");
		author = sc.nextLine();
	}
	public void printDetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Publisher:"+publisher);
		
	}
}
public class OOPS_Demo {
	public static void main(String [] args) {
		Book book = new Book("DC Books");
		book.readBookDetails();
		book.printDetails();
	}

}
