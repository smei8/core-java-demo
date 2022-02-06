package arrays;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		//declaring an array
		int[][] martixA = new int[2][3];  //want 2 rows and 3 column
		
		martixA[0][0] = 10;
		martixA[0][1] = 20;
		martixA[0][2] = 30;
		martixA[1][0] = 40;
		martixA[1][1] = 50;
		martixA[1][2] = 60;
		
		for (int i = 0; i < martixA.length; i++) {
			for (int j = 0; j < martixA[i].length; j++) {
				//printed the first row
				System.out.print(martixA[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println(martixA.length);
		//initialize an array
		//int[][] matrixB = {{10, 20, 30}, {40, 50, 60}};
		
	}

}
