package OnlyPractice.pack1;

public class CurrentAccount extends BankAccount {

	// Constructor
	public CurrentAccount(String accno, double initialBalance) {
	   super(accno, initialBalance);
	}

	// Implementation of the abstract method
	@Override
	public void calculateInterest() {
	   System.out.println("No interest is calculated for Current Account.");
	}
	}
