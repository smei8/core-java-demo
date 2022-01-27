package flowcontrolandloops;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to check if a number is greater than 10
		// input
		int number = 7;
		String output = "";

		// process - logic
		if (number > 10) {
			// true part goes here
			output = number + " is greater than 10";
		} else {
			// false part goes here
			output = number + " is lesser than 10";
		}

		// output
		System.out.println(output);
	}

}
