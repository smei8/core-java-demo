package assignment1;
import java.util.Scanner;

public class NumIdentify {
	public static String evenOrodd(int num) {
		String output = "";
		
		if (num % 2 == 0) { 
			output = "Number is even!";
			return output;
		} else {
			output = "Number is odd!";
			return output;
		}
	}
	public static String oddOnly(int num) {
//		int i = 1;
//		while (i <= n || i % 2 != 0) {
//			int odd = i;
//			System.out.println(odd);
//			i++;
//		}
//		return i;
		String output = "";
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				//System.out.println(i);
				output = output + i;
			}
		}
		return output;
	}
	public static boolean isPrime(int num) {
		//check if # is 1 or less than 1
		if (num <= 1) { return false; }
		else if (num == 2) { return true; }
		
		for (int i = 3; i <= (Math.sqrt(num) + 1); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// input
		Scanner numInput = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = numInput.nextInt();
		numInput.close();
		
		//method calling
		String answer = evenOrodd(number);
		String oddNum = oddOnly(number);
		
		System.out.println(oddNum);
		System.out.println(answer);
		if (isPrime(number))
			System.out.println("true");
		else 
			System.out.println("false");
		//System.out.println(oddNum);
	}

}
