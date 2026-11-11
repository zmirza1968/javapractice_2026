package Day12JavaMethodandConstructor;

public class BankAccount {
	 double balance;
	    double interestRate;

	    // Constructor
	    BankAccount(double bal, double interest) {
	        balance = bal;
	        interestRate = interest;
	    }

	    // Method has no parameters and no return value
	    void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }

	    // Method has no parameters and returns a value
	    double getInterestRate() {
	        return interestRate;
	    }

	    // Method takes parameters and has no return value
	    void deposit(double amount) {

	        if (amount > 0) {
	            balance = balance + amount;
	            System.out.println("Deposit amount is: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
	    
	   boolean withdraw(double amount){
	    	
	    	if(amount>0 && amount <=balance) {
	    		balance =balance-amount;
	    		System.out.println("Withdraw amount :"+amount);
	    		return true;
	    	}
	    	else {
	    		System.out.println("Insufficient balance or invalid amount ");
	    		return false;
	    	}
	    }

	public static void main(String[] args) {
	
		BankAccount account = new BankAccount(500, 5.00);

        account.checkBalance();

        double interestRate = account.getInterestRate();
        System.out.println("Interest rate is: " + interestRate);

        account.deposit(200.00);

        account.checkBalance();
        
        boolean status =account.withdraw(300.00);
        
        if(status==true)
        {
        	account.checkBalance();
        	
        	
        	//58
        }
    }
}


