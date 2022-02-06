package classesandobjects;

public class Room {
	int breadth;
	int length;
	int height;
	
	int calculateFloorArea() {
		int floorArea = length * breadth;
		return floorArea;
	}
	int costOfPainting(int paintRate) {
		
		int wallArea = 2 * ((length * height) + (height + length));
		return paintRate * wallArea;
		
	}
	
}
