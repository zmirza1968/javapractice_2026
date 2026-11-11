package Day12JavaMethodandConstructor;

public class ShopingCart {
	
	double totalAmount=00;
	
	//to add a single item to the cart
	void addItem(double price) // parameter 
	{
		totalAmount=totalAmount+price;
		System.out.println("Item added :"+price);
	}
	
	/*
	void addItems(double price1,double price2,double price3)
	{
		totalAmount=totalAmount+price1+price2+price3;
		System.out.println("Item added :"+price1+ " "+price2+ " "+price3);
	}
	*/
	
	
	void addItems(double...prices)
	{
		for(double price:prices)
		{
			totalAmount=totalAmount+price;
		}
	}
	
	
	
 void displayTotal() {
	 
	 System.out.println("Total amount of in the cart :"+totalAmount);
 }
	
	
	
	

	public static void main(String[] args) {
		
		ShopingCart cart= new ShopingCart();
		//cart.addItem(29.99); // argument 
		//cart.displayTotal();
		
		//cart.addItems(15.49,9.99 ,45.00);
		//cart.displayTotal();
		
		cart.addItems(10.5,11.25,13.25,15.25,16.59);
		//cart.addItems(10.5,11.25,13.25,15.25);
	//	cart.addItems(10.5,11.25,13.25);
		cart.displayTotal();
		
		//32
	}

}
