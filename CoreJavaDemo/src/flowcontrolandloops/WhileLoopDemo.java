package flowcontrolandloops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print hello java 5 time in the console
		
		int i = 1; // initial value
		while(i <= 5) { // condition
			System.out.println("Hello Java");
			i++; // expression
		}
		
		// i = 1, condn = true, i = 2
		// i = 2, condn = true, i = 3
		// i = 3, condn = true, i = 4
		// i = 4, condn = true, i = 5
		// i = 5, condn = true, i = 6
		// i = 6, condn = false
	}	
}
