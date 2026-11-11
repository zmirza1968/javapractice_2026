package OnlyPractice;

public class Car1 {
	
	String make;
	String model;
	int year;
	
	
	
	Car1(String carmake,String carmodel,int caryear)
	{
		make=carmake;
		model=carmodel;
		year=caryear;
	}
	
	
	// method to display car details
	
	void display() {
		
		System.out.println("Car make :"+make);
		System.out.println("Car model :"+model);
		System.out.println("Car year :"+year);
	}

}
