package arrays;

import classesandobjects.Room;

public class RoomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room1 = new Room(20, 40);
		Room room2 = new Room(139, 288);
		
		Room[] myRoom = new Room[3]; //the object is not created yet, we only created a array of 3 room references
//		myRoom[0] = new Room(21.3, 12.3); //the room object is created
//		myRoom[1] = new Room(15.6, 3);
//		myRoom[2] = new Room(35.6, 3.4);
		
		for (int i = 0; i < myRoom.length; i++) {
			myRoom[i] = new Room(40, 20);
		}
		
		Room[] allRoom = {new Room(34, 32), new Room(13, 25), new Room(57, 48), new Room(34, 84)};
	}
}
