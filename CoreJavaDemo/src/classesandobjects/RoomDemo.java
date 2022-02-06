package classesandobjects;

public class RoomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Room room1 = new Room();
//		room1.length = 16;
//		room1.breadth = 13;
		//room1.height = 10;
		
		Room room1 = new Room(200, 100);
		
		System.out.println("Floor area: " + room1.calculateFloorArea());
		System.out.println("Painting cost:  " + room1.costOfPainting(2));
		
//		Room room2 = new Room();
//		room2.length = 20;
//		room2.breadth = 34;
		//room2.height = 12;
		
		Room room2 = new Room(300, 150);
		
		System.out.println("Floor area: " + room2.calculateFloorArea());
		System.out.println("Painting cost:  " + room2.costOfPainting(3));
		
		Room room3 = new Room(400, 200, 101, "red");
		
	}

}
