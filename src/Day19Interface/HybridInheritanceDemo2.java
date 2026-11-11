package Day19Interface;

interface Int1
{
	
	void m1();
}


interface Int2
{
	void m2();
	
}



interface combinedInte extends Int1,Int2
{
	
}

class cls 
{
	
	void c1() 
	{
		System.out.println("this is c1() from c class ....");
		
	}
}



public class HybridInheritanceDemo2 extends cls implements combinedInte

{
public void m1() {
		
		System.out.println("this is m1() from I1 interface...");
	}
	
	public void m2() 
	{
		System.out.println("this is m2() from int2 interface ");
	}
		
		
		
	public static void main(String[] args) {
		
		HybridInheritanceDemo2 h2= new HybridInheritanceDemo2();
		h2.m1();
		h2.m2();
		
	}

}
