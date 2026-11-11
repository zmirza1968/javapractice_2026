package Day13OverRidingOverLoading;

public class Calculator {
	
	//Method Overloading
	// compile time polymorphism
	int add(int a, int b){
		return a+b;
	}
	
	
	double add(double b, double a){
		return b+a;
	}

	int add(int a, int b, int c){
		return a+b+c;
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Calculator cal =new Calculator();
		System.out.println( cal.add(10,20));
		System.out.println( cal.add(10,20,30));
		System.out.println( cal.add(10.5,5.0));
		
		System.out.println( cal.add(10.5,5));
		
		

	}

}
