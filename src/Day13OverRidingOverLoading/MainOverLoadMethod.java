package Day13OverRidingOverLoading;

public class MainOverLoadMethod {
	
	void main()
	{
		System.out.println("This is main with no params");
	}
	
	
	void main(String s) {
		System.out.println("This is one parameter "+s);
		
	}
	
	void main (String a, String b) {
		
		System.out.println("This is two parameter :"+a+ " "+b);
	}
	

	public static void main(String[] args) {
		
		MainOverLoadMethod ol = new MainOverLoadMethod();
		ol.main();
		ol.main("A","B");
		ol.main("Welcome");
	
		
	
	}

}
