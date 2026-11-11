package Day14Encapsulation;

public class ObjectCounter {
	
	static int ObjectCont =0;
	
	ObjectCounter()		
			{
		ObjectCont++;
	}
	
	static int getObjectCont() {
		return ObjectCont;
	}

	public static void main(String[] args) {
		
		ObjectCounter obj1 = new ObjectCounter();
		ObjectCounter obj2 = new ObjectCounter();
		ObjectCounter obj3 = new ObjectCounter();
		
		System.out.println("Number of objects "+getObjectCont());
		
		
		

	}

}
