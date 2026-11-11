package OnlyPractice;

public class BankAccount {
	/* Explanation:
=================================== DAY 11 ===============
	The BankAccount class has attributes accountNumber, accountHolderName, and balance.
	The deposit() method adds money to the account.
	The withdraw() method subtracts money, checking if the balance is sufficient.
	The checkBalance() method displays the current balance.
	In the main method, a BankAccount object is created, and deposit, withdrawal, and balance check operations are performed.


public class BankAccount {
    // Attributes
    String accountNumber;
    String accountHolderName;
    double balance;

    // Method to deposit money into the account
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money from the account
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to check the balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to perform deposit, withdrawal, and balance check operations
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = "123456789";
        account.accountHolderName = "John Doe";
        account.balance = 1000.0;

        account.checkBalance();

        account.deposit(500.0);
        account.checkBalance();

        account.withdraw(200.0);
        account.checkBalance();

        account.withdraw(1500.0); // Attempt to withdraw more than the balance




	*/
	
	
	
	
    }

	 


