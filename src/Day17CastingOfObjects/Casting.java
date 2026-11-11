package Day17CastingOfObjects;

class Vehicle 
{
	String brand ="Hyundai";
	
	void start () 
	{
		System.out.println("vehicle is starting ");
	}
	
	void run()
	{
		System.out.println("vehicle is running ...");
	}
	
}


class car extends Vehicle 
{
	
	String model= "i20";
	
	void stop()
	{
		System.out.println("Car is stopping ...");
	}
	
	void run()
	{
		System.out.println("car is running ...");
	}
}


public class Casting {

	public static void main(String[] args) {
		
		// Upcasting 
		
		Vehicle p = new car(); // parent class reference can hold child class object
		System.out.println(p.brand);
		
		p.start();
		p.run();
		
		
		Vehicle v = new car(); 
		car c=(car)v;
		System.out.println(c.brand);
		System.out.println(c.model);
		
		c.start();
		c.start();
		c.run();
		
		
	

	}

}
