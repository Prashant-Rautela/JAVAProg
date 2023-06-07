package java8Features;

public class ICICI implements Bank {

	public static void main(String[] args) {

		ICICI i = new ICICI();

		i.giveCredit(); // calling default method of interface
		giveLoan(); // calling method of class
		i.rateOfInt(); // calling rate of int method of class
		
		Bank.giveLoan();  // call static method of interface
		
	}

	@Override
	public void rateOfInt() {
		System.out.println("ICICI bank implementation");

	}

	static void giveLoan() {
		System.out.println("loan method in class");
	}

	

}
