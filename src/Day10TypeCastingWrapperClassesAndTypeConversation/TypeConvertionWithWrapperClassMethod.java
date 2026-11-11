package Day10TypeCastingWrapperClassesAndTypeConversation;

public class TypeConvertionWithWrapperClassMethod {

	public static void main(String[] args) {
		
		
		// String --> int--> double--> boolean , char
		
		// String s1="welcome"; // this cannot be convert int int
		
		//String s1="10";
		//String s2="20";
		
		//System.out.println(s1+s2); // 1020 not allowed to do arthmatic operatons
		
	//System.out.println(	Integer.parseInt(s1)+Integer.parseInt(s2));
	//	int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		
	//	System.out.println(sum);
				
		
		
		// int,double,boolean,char ----->String
		
		/*
		String s1="10.5";
		String s2="20.00";
		
		double sum=Double.parseDouble(s1)+Double.parseDouble(s2);
		System.out.println(sum);
		*/
		
		// String  > boolean
		String s="true";
		System.out.println(Boolean.parseBoolean(s));
		

	}

}
