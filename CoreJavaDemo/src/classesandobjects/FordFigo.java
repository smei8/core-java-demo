package classesandobjects;

public class FordFigo {
	
	//variables - property, state, attribute
	//instance variable - scope, can be access by any method wthin this class
	int modelNumber;
	String color;
	String carType;
	
	//methods - function, actions the object can perform
	String unlockCar() {
		return "FordFigo unlocked";
	}
	
	String lockCar() {
		return "FordFigo locked";
	}
	
	String accelerate() {
		return "FordFigo accelerated";
	}
	String applyBrake() {
		manualBrakeSystem();
		return "FordFigo appied brakes";
	}
	void manualBrakeSystem() {
		System.out.println("Manual Brakes Applied");
	}
}
