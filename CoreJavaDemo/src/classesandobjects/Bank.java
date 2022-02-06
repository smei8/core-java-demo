package classesandobjects;

public class Bank {
	
	String name;
	double balance;

	
	String newAccount() {
		
		return name + " your accout have been created!";
	
	}
	double checkBalance() {
	
		//balance = 1000;
		return balance;
				
	}
	int withdraw(int amount) {
		
		balance -= amount;
		return amount;
		
	}
}
