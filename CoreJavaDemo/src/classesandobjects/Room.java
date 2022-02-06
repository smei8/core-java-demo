package classesandobjects;

public class Room {
	//when instance var does not have public specifier, it cannot be access in another class that is in another package
	//these two instance var is different then the one from the constructor
	int length;
	int breadth;
	static int height;
	
	int roomNum;
	String roomColor;
	
	static {
		height = 50;
	}
	public Room(int length, int breadth) { // this is a default constructor because there is no access specifier in the front
		//this length and breadth is local to this constructor method
		//this keyword refers to the current object, the instance variable
		//use this keyword only when the variable name are the same otherwise is not needed
		this.length = length;
		this.breadth = breadth;
	}
	
	//constructor overloading - a type of polymorphism
	public Room(int length, int breadth, int roomNum, String roomColor) {
//		this.length = length;
//		this.breadth = breadth;
		//constructor chaining
		this(length, breadth);
		this.roomNum = roomNum;
		this.roomColor = roomColor;
	}
	int calculateFloorArea() {
		int floorArea = length * breadth;
		return floorArea;
	}
	int costOfPainting(int paintRate) {
		
		int wallArea = 2 * ((length * height) + (height + length));
		return paintRate * wallArea;
		
	}
	
}
