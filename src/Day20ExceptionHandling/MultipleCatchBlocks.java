package Day20ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
	
		/*
		try 
		{
		int a[]= new int[3];
		System.out.println(a[5]);
		
		int result=100/2;
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Handle ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handle ArrayIndexOutBondException..");
		}
			*/
		
		try 
		{
		int a[]= new int[3];
		System.out.println(a[5]);
		
		int result=100/0;
		}
		catch(Exception e) 
		{
			System.out.println("Handle Exception");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

		
	}

}
