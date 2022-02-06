package scannerexamples;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java online documentation

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number:");
		int number = scan.nextInt();
		System.out.println("the number entered is:" + number);
		
		System.out.println("Do you want to continue(y/n):");
		char option = scan.next().charAt(0);
		System.out.println("option entered is:" + option);
	}

}
