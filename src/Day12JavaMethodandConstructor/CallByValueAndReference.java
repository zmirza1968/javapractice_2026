package Day12JavaMethodandConstructor;

public class CallByValueAndReference {

	public static void main(String[] args) {
	
		Example ex = new Example();
	//	ex.callByValue(ex.data);
	//	System.out.println("After callbyvalue :");
		ex.callByRef(ex);
		System.out.println("after callbyref :"+ex.data);

	}

}
