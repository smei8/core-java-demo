package flowcontrolandloops;

public class DoWhileDemo {
	public static void main(String[] args) {
		//print first n natural number
		
		//input 
		int number = 8;
		
		int i = 1; //initial value
		do {
			//body of loop 
			System.out.println(i);
			
			//expression
			i++;
		} while (i <= number); //condition
		
	}
}
