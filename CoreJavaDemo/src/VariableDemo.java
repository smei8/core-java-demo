
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8 primitive data types
		
		// byte - takes 1 byte of memory - whole numbers
		// short - takes 2 bytes of memory
		// int - 4 bytes
		// long - 8 bytes
		
		// float - decimal numbers
		// double
		 
		// boolean - true or false
		
		// char - single character

		
		// int literal - negative and positive whole numbers
		// float literal - decimal numbers - 4.5, 2.7
		
		//declare a variable
		int englishMark;
		
		// assigned a value to the variable
		englishMark = 20;
		
		//initialize a variable
		int mathMark = 50;
		
		System.out.println("English Mark : " + englishMark);
		System.out.println("Math Mark is " + mathMark);
		
		short test = 4567;
		long longTest = 234567890;
		
		boolean flag = true;
		boolean result = false;
		
		System.out.println("Flag is : " + flag);
		System.out.println("Result is : " + result);
		
		char option = 'y';
		System.out.println("option is: " + option);
		
		//type casting
		byte data = 45;
		int myData = data; // implicit casting
		
		byte smallData = (byte) myData; // explicit casting 
		// ---- ---- ---- ---- ---- ---- ---- ----
		
		double socialMark = 45.67;
		
		// DECIMAL LITERAL BY DEFAULT ARE OF TYPE DOUBLE
		//float scienceMark = 56.78;
		//float scienceMark = (float) 56.78; // valid
		//float scienceMark = 56.78f; // valid 
		float scienceMark = 56.78F; // valid
		
		System.out.println("social mark is : " + socialMark);
		System.out.println("science mark is : " + scienceMark);
		
	}

}
