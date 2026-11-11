package Day16OverridingVsOverloading;

class Parent
{
	int num=10;
	void dispaly() 
	{
		System.out.println("This is display method from parent class...");
	}
	


Parent()
{
	System.out.println("Parent class constructor...");
}
}
class Child extends Parent{
	
	int num=20; // overridden 
	void show() {
		//System.out.println(num);
		System.out.println(super.num); // super key word value getting from parent class variable 
	}
	
	Child(){
	//	System.out.println("This is child class constructor...");
		super();
	}
	
}



public class SuperKeyWordExample {

	public static void main(String[] args) {
		
		Child ch =new Child();
	//	ch.show();
		
		
		//Child ch = new Child();
		//ch.dispaly();
	
		
	}

}
