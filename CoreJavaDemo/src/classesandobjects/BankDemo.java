package classesandobjects;

public class BankDemo {

	public static void main(String[] args) {

		Bank newUser = new Bank();
		
		newUser.name = "Suzanna";
		//newUser.birthday = "08/21";
		newUser.balance = 1000;

		
		System.out.println(newUser.newAccount());
		System.out.println("You have withdrew $"+ newUser.withdraw(100));
		System.out.println("You now have $" + newUser.checkBalance() + " left!");
	}

}
