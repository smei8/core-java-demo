// write  a program to find the square of a number

// input
// process
// output


//scope of the variable

public class MethodDemo {
	//method definition
	public static int squareOfANumber(int num) {
		//process
		int ans = num * num;
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int number = 30;
		
		// method invocation
		int myAnswer = squareOfANumber(number);
		
		//output
		System.out.println("Square of " + number + " is " + myAnswer);
	}

}
