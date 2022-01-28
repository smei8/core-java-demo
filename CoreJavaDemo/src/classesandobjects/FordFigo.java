package classesandobjects;

public class FordFigo {
	
	// declare a variable - instance variable
	int modelNo;
	String color;
	String carType;
	
	String unlockCar() {
		
		// declare a variable - local variables
		
		int temp = 50;
		
		return "FordFigo unlocked";
	}
	
	String lockCar() {
		return "FordFigo locked";
	}
	
	String accelerate() {
		return "FordFigo accelerated!";
	}
	
	String applyBreak() {
		mannualBrakeSystem();
		return "FordFigo applied brake!";
	}
	
	void mannualBrakeSystem() {
		System.out.println("Manual Brakes applied!");
	}
	
}
