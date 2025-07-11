import java.util.Scanner;

/*******************************************************
 * Title      : Generate Even Numbers
 * Author     : Sarju S
 * Date       : 11-07-2025
 * Description: Generate even numbers upto a 
 *              limit using for loop
 *******************************************************/

public class GenerateEvenNumbers {

		public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enete a limit");
		int limit = sc.nextInt();
		for(int i=2;i<limit;i+=2) {
			System.out.print(i+"\t");
		}
			

	}

}
