package classesandobjects;

public class FordFigoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primitive type
		int mark;
		mark = 50;
		
		//derived type
		FordFigo fordFigo; // here no object is created
		fordFigo = new FordFigo(); // object is created
		
		fordFigo.modelNo = 123456;
		fordFigo.color = "black";
		fordFigo.carType = "hatch back";
		
		System.out.println("Car color: " + fordFigo.color);
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBreak());
		System.out.println(fordFigo.lockCar());
		
		//fordFigo = null;
		
		System.out.println("--------------------");
		FordFigo fordFigo2 = new FordFigo();
		
		fordFigo2.modelNo = 123477;
		fordFigo2.color = "silver";
		fordFigo2.carType = "hatch back";
		
		System.out.println("Car color: " + fordFigo2.color);
		System.out.println(fordFigo2.unlockCar());
		System.out.println(fordFigo2.accelerate());
		System.out.println(fordFigo2.applyBreak());
		System.out.println(fordFigo2.lockCar());
		
		
		
	}

}
