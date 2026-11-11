package Day10TypeCastingWrapperClassesAndTypeConversation;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		// Widening Example (lower to higher)
		//byte -> short -> int > long > float > double
		
		/*
		byte b=100;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println(d);
		
		
		*/
		
		// Narrowing casting 
		
		double d=100.1234567;
		float f=(float )d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		
		System.out.println("double value of :" +d);
		System.out.println("float value of :" +f);
		System.out.println("long value of :" +l);
		System.out.println("int  value of :" +i);
		System.out.println("short value of :" +s);
		System.out.println("byte value of :" +b);
		
		
		
	
	}

}
