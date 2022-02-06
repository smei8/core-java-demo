package assignment1;
import java.util.Scanner;

public class NumberCompute {
	
	public static int fibonacci(int num) {
		int sum = 0; // to store the sum of
		int n1 = 1;  // term Xn starting at 1
		int n2 = 1;  // term Xn-1 starting at 1
		
		if (n1 == 0)
			sum = 0;
		else if (n1 == 1 || n2 == 2)
			sum = 1;
		
		for (int i = 3; i <= num ; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		return sum;
	}
	public static int factorial(int num) {
		int total = 1;
		
		if (num == 0 || num == 1) 
			total  = 1;
		
		for (int i = 2; i <= num; i++) {
			total = total * i;
		}
		return total;
	}
	public static int sumOfDigits(int num) {
		int sum = 0; // sum of the digits
		
		//int i;
		while (num > 0) {    // num = 123
			sum = sum + num % 10;  // sum = 123 % 10 = 3 sum = 12 % 10 = 2 + 3 = 5 
			num = num / 10;	 // num = 123 / 10 = 12
			//System.out.println(sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		input.close();
		
		int fibOutput = fibonacci(num);
		System.out.println("The fibonacci of " + num + " is " + fibOutput);
		
		int facOutput = factorial(num);
		System.out.println("The factorial of " + num + " is " + facOutput);
		
		int sumInput = sumOfDigits(num);
		System.out.println("The sum of digits " + num + " is " + sumInput);
	}

}
