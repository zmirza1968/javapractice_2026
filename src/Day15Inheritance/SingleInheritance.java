package Day15Inheritance;

class Vehicle {

	String brand = "Hyundai";

	void start() {
		System.out.println("Vehicle le is starting ");
	}

}


class car  extends Vehicle{
	
	String model ="i20";
	
	void display() {
		
		System.out.println("model :"+model);
		System.out.println("brand :"+brand);
	}
}




public class SingleInheritance {

	public static void main(String[] args) {
		/*
		car c= new car();
		c.brand=("Hyundai");
		c.model=("i20");
		c.display();
		c.start();
		*/
		
		/*
		Vehicle v = new Vehicle();   
		System.out.println(v.brand);  //Hyundai
		v.start();     	//Vehicle le is starting
		
	*/
		/*
		Vehicle var = new car(); // parent calss varaible can hold child class object // Up casting
		
		System.out.println(var.brand);
		var.start();
		*/
		/*
		car ca = (car) new Vehicle();// Type mismatch: cannot convert from Vehicle to car // Down casting
										// 	Type casting is needed
		
		 								//java.lang.ClassCastException run time exception
		System.out.println(ca.brand);
		System.out.println(ca.model);
		//ca.display();
		 
		 */

	}

}
