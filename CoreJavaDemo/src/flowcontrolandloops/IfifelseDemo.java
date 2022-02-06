
package flowcontrolandloops;
import java.util.Scanner;

public class IfifelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to check if a number is greater than 10
		//input
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numInput = number.nextInt();
		number.close();
		//int number = 5;
		String output = " ";
		
		//process
		if(numInput > 10) {
			//if true
			output = numInput + " is greater than 10";
		} else { output = numInput + " is less than 10"; } //if false
			
		
		//output
		System.out.println(output);
	}

}
