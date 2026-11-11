package Day3Operators;

public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 20, b = 10;

		System.out.println(a + b);
		System.out.println("SUm of and b is : " + (a + b));
		System.out.println("Diff of and b is : " + (a - b));
		System.out.println("Product SUm of and b is : " + (a * b));
		System.out.println("div  of a and b : " + (a / b));
		System.out.println("modulo division  of a  and b is : " + (a % b));

		/*
		 * Relational/Comparison Operators Comparison operators are used to compare two
		 * values (or variables). It returns a boolean value (true/false). == != < >= <=
		 */
		b=20;
		a=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println(a>b);
		System.out.println(a<b);
		a=10;
		b=10;
		 System.out.println(a<=b);
		 System.out.println(a>=b);
		 /*
		 Logical Operators
		 Logical operators are used to perform logical AND, OR and NOT operations.
		 It returns a boolean value (true/false).
		 */
		 
		 boolean x=true;
		 boolean y=false;
		 
		 System.out.println(x && y);
		 System.out.println(x || y);
		 
		 System.out.println(!x);
		 System.out.println( ! y);
		 
		 boolean b1=10>20;
		 System.out.println(b1);
		 
		 boolean b2=20>10;
		 
		 System.out.println(b2);
		 System.out.println(b1 && b2);
		 System.out.println(b1 || b2);
		 
		 System.out.println((10<20) && (20>10));
		 System.out.println((10<20) || (20>10));
		 
	}

}
