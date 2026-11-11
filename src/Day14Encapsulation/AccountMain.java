package Day14Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc= new Account();
		acc.setAccno(12345);
		acc.setName("John");
		acc.setAmount(50000);
		
		
		System.out.println("Account Number : "+acc.getAccno());
		System.out.println("Total Amount :"+acc.getAmount());
		System.out.println("Name :"+acc.getName());
	}

}
