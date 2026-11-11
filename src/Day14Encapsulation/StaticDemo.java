package Day14Encapsulation;

public class StaticDemo {
	
	static int a=10; // static variable
	int b=20; // non-static variable
	

	static void m1() // static method
	{
		System.out.println("This is m1 static mehtod..");
		
	}
	
	void m2() // non static method
	{
		System.out.println("This is non-static mehntod..");
	}
	
	
	void m3() {
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		 m1();
		 m2();
		
	}
	
	
	


}
