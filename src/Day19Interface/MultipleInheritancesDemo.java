package Day19Interface;

interface Animal
{
	void eat();
	void dup();
}


interface Bird

{
	void fly();
	void dup();
}








public class MultipleInheritancesDemo implements Animal, Bird

{

	public void eat() 
	{
		System.out.println("EATING....");
	}
	
	public void fly() 
	{
		System.out.println("Flying...");
	}
	
	public void dup() {
		System.out.println("THIS IS DUPLICATE MEHTOD FROM PARENT INTERFACE");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritancesDemo obj = new MultipleInheritancesDemo();
		obj.eat();
		obj.fly();
		obj.dup();
	
	}

}
