package Day20ExceptionHandling;

public class FinalBlock {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		
		try
		{
			
			int res=num1/num2;
			//System.out.println(res);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Handle exception successfully");
		}
		finally {
			System.out.println("Enter into final block....");
		}
		System.out.println("statment 1...");
		System.out.println("statment 2...");
		System.out.println("statment 3...");
	}

}
