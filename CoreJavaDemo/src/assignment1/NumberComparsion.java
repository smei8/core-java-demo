package assignment1;
import java.util.Scanner;

public class NumberComparsion {
	public static int greaterOfTwo(int first, int second) {
		int a = first;
		int b = second;
		
		if (a > b) { return a; } 
		else { return b; }

		
//		if (a == b) {
//			System.out.println("They are the same.");
//		} else if (a > b) {
//			return a;
//		} else { return b; }
		
		//what if two numbers are the same?
//		int greater = first > second ? first : second;
//		return greater;
		
	}
	public static int greatestOfThree(int first, int sec, int third) {
		int a = first;
		int b = sec;
		int c = third;
		
		//what if all three numbers are the same?
		if (a > b && a > c) { return a; } 
		else if (b > c) { return b; }
		else { return c; }
	}

	public static void main(String[] args) {
		//input
		Scanner numInput1 = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1 = numInput1.nextInt();
		numInput1.close();
		
		Scanner numInput2 = new Scanner(System.in);
		System.out.println("Please enter the second number: ");
		int num2 = numInput2.nextInt();
		numInput2.close();
		
		//method calling
		if (num1 == num2) {
			System.out.println("Both are equal!");
		}
		else {
			int greater = greaterOfTwo(num1, num2);	
			System.out.println(greater + " is greater!");
		}
		
		Scanner numInput3 = new Scanner(System.in);
		System.out.println("Please enter a third number: ");
		int num3 = numInput3.nextInt();
		numInput3.close();
		
		int greatest = greatestOfThree(num1, num2, num3);
		
		System.out.println(greatest + " is the greatest of them all!");
		

	}

}
