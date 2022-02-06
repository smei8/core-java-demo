package classesandobjects;

public class FordFigoDemo {

	public static void main(String[] args) {
		
		//derived type
		FordFigo fordFigo;
		//object is created 
		fordFigo = new FordFigo();
		
		fordFigo.modelNumber = 12345;
		fordFigo.color = "black";
		fordFigo.carType = "hatch back";
		
		System.out.println("Color: " +fordFigo.unlockCar());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBrake());
		System.out.println(fordFigo.lockCar());
		
		System.out.println("----------------------------------------");
		
		FordFigo fordFigo2 = new FordFigo();
		
		fordFigo2.modelNumber = 23456;
		fordFigo2.color = "silver";
		fordFigo2.carType = "hatch back";
		
		System.out.println("Color: " + fordFigo2.unlockCar());
		System.out.println(fordFigo2.accelerate());
		System.out.println(fordFigo2.applyBrake());
		System.out.println(fordFigo2.lockCar());
		
	}

}
