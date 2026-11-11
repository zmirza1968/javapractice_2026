package Day18;

abstract class Bike
{
	void start() 
	{   // Non abstract method
		System.out.println("Starting ");
	}
	
	
	abstract void drive(); // abstract method no implementation
	
	
	final void stop()  // final method cannot override in child class 
	{
		System.out.println("stopping the bike");
	}
	
	
	// abstract method 
	static void park()  // directly access through class 
	{
		System.out.println("parking ");
	}
	
}



class Honda extends Bike
{

	@Override
	void drive() {
		System.out.println("Driving safely ");
		
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		/*
		Honda h= new Honda();// valid but we cannot achive data abstraction
		h.start();
		h.driver();
		h.stop();
		h.stop();
		//h.park();
		Bike.park();
		*/
		
		Bike h= new Honda();// valid but we cannot achive data abstraction
		h.start();
		h.drive();
		h.stop();
		h.stop();
		//h.park();
		Bike.park();
		
//101
	}

}





