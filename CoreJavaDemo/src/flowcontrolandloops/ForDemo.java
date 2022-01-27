package flowcontrolandloops;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print all even numbers upto N
		//input
		int number = 30;
		
//		for(int i=1; i<=number; i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		for(int i=2; i<=number; i=i+2) {
			System.out.println(i);
		}
	}

}
