package Day19Interface;


interface I1
{
	
	void m1();
}


interface I2
{
	void m2();
	
}



class c
{
	
	void c1() 
	{
		System.out.println("this is c1() from c class ....");
		
	}
}



public class HybridInheritanceDemo extends c implements I1,I2
{
	public void m1() {
		
		System.out.println("this is m1() from I1 interface...");
	}
	
	public void m2() {
		
		System.out.println("this is m2() from I2 interface...");
	}
	
	
	

	public static void main(String[] args) {
		
		HybridInheritanceDemo obj = new HybridInheritanceDemo();
		obj.c1();
		obj.m1();
		obj.m2();
	
	}

}
