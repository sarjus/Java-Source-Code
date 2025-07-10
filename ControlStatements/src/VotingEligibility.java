/*******************************************************
 * Title      : [Document Title Here]
 * Author     : Sarju S
 * Date       : [Insert Date]
 * Description: [Brief description of the document]
 *******************************************************/

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Eligible to Vote");
		}
		sc.close();

	}

}
