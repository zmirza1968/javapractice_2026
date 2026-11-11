package Day14Encapsulation;

public class StaticMain {

	public static void main(String[] args) {
	
		System.out.println(StaticDemo.a);
		//System.out.println(b);// invalid bcoz b is non static 
		
		StaticDemo.m1();
		//m2(); // invalid  bcoz m2() is non static method 
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m3();
	}

	}


