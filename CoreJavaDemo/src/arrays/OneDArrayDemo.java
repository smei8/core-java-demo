package arrays;

public class OneDArrayDemo {
	
	public static void main(String[] args) {
		
		int mark1;  //declare an int local variable
		mark1 = 20;  //initialize the local variable
		
//		int[] myMark;  //declared an int array variable
//		myMark = new int[5]; //initialize the array to be size 5, this is where the array is created

		//combining it into one line
		int[] myMark = new int[5];
		
		myMark[0] = 20;
		myMark[1] = 30;
		myMark[2] = 40; 
		myMark[3] = 50;
		myMark[4] = 60;
		
		for (int i = 0; i < myMark.length; i++) {
			System.out.println(myMark[i]);
		}
			
	}
}
