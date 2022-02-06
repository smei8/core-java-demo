package flowcontrolandloops;

public class ForDemo {
	public static void main(String[] args) {
		//print all even number upto N
		
		//input
		int number = 30;
		
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) { System.out.println(i); }
		}
	}
}
