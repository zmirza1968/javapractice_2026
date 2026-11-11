package Day12JavaMethodandConstructor;

public class Example {
	
	int data =50;
	/*
	void callByValue(int data)
	{
		data = data+100;
		System.out.println("Inside callByValue method "+data);
	}
	*/
	
	void callByRef(Example ex) {
		
		ex.data=data+100;
		System.out.println("Inside callbyrefernce method :"+ex.data);
		
	}
	
	
}
