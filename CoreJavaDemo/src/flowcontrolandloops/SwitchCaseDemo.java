package flowcontrolandloops;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to check if a char is a vowel or not
		
		//input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		char letter = scan.next().charAt(0);
		scan.close();
		
		String output = "";
		
		//process - logic
		//switch only takes char or int or data type is not supported
		switch(letter) {
			case 'a', 'e', 'i', 'o', 'u':
				output = "Vowel";
				break; //without the break statement, it will continue even if the letter match
					   //it will jump to the default case and return that as the output
//			case 'e':
//				output = "Vowel";
//				break;
//			case 'i':
//				output = "Vowel";
//				break;
//			case 'o':
//				output = "Vowel";
//				break;
//			case 'u':
//				output = "Vowel";
//				break;
			default:
				output = "Not a Vowel!"; //if none of the case above is true
				break;
		}
		
		
		//output
		System.out.println(output);
	}

}
