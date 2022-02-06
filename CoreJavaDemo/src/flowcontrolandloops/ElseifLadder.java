package flowcontrolandloops;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
		// check if a number is less than 0 or b/w 1 and 100 or greater than 100
		
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scan.nextInt();
		scan.close();
			
		String output = " ";
		if (number < 0) {
			output = number + " is less than 0";
		} else if (number >= 1 && number <= 100 ) {
			output = number + " is in between 1 and 100";
		} else if (number > 100) {
			output = number + " is greater than 100";
		}
		
		System.out.println(output);
	}

}
