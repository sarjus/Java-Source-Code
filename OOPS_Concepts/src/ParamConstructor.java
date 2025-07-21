
import java.util.Scanner;
class Student{
	String name;
	int rollNumber;
	String dept;
	Student(String name, int rollNumber, String dept){
		this.name = name;
		this.rollNumber = rollNumber;
		this.dept = dept;
	}
}
public class ParamConstructor {
	public static void main(String [] args) {
		String name;
		int rollNumber;
		String dept;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		rollNumber = sc.nextInt();
		dept = sc.nextLine();
		Student student = new Student(name,rollNumber,dept);
	}

}
