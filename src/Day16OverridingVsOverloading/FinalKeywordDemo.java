package Day16OverridingVsOverloading;


class FinalClass
{
		
	final int var =100;
	
	void m1() {
		
		System.out.println("his is m1 method....");
	}
}


class SubClass extends FinalClass {
void m1() {
		
		System.out.println("his is m1 method....");
	}
	
}
	
	




public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		FinalClass fc = new FinalClass();
	//	fc.var=200; // can not change the final variable 
		System.out.println(fc.var);
		fc.m1();
	
	}

}
