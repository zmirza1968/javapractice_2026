package Day19Interface;


interface Vehicle
{
	int max_speed=120; // final & static
	int min_speed=10;	// final static
	
	
	void start();  // abstract method  no need to specify abstract keyword, public modifier is accociated
	
	default void drive() // Default method (supported from java8)
{
	System.out.println("Driving safely..");
}
	
	
	static  void showMaxSpeed() // static method (supported from java8)
	{
		System.out.println("Maximum speed is :"+max_speed);
	}
	
	private void showMinSpeed() // private method (supported from java9)
	{
		System.out.println("Minimum speed is :"+min_speed);
	}
	
	default void showSpeeds()
	{
		showMaxSpeed();
		showMinSpeed();
		
	}
}



class car implements Vehicle
{
	public void start()
	{
		System.out.println("Car is starting....");
	}

}





public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle v = new car();
		
		v.start();
		v.drive();		
		//Vehicle.showMaxSpeed();
		//v.showMinSpeed();// cannot access since it is private method
		
		v.showSpeeds();
		//45
	
	}

}
