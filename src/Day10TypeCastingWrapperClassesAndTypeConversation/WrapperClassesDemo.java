package Day10TypeCastingWrapperClassesAndTypeConversation;

import java.util.ArrayList;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		// 1. Converting primitive data to object type (Auto Boxing). using WrapperClasses 
		
		int i=10;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		//Integer iobj =new Integer(i); // deprecated
		Integer iobj=i;
		System.out.println(iobj);
		
		
		Double dobj =d;
		System.out.println(dobj);
		
		Character cobj=c;
		System.out.println(cobj);
		
		Boolean bobj =b;
		System.out.println(bobj);
		// 41
		
		//2. Converting object type data to primitive (Un boxing):
		
		int intvalue=iobj;
		double doublevalue=dobj;
		char charvalue=cobj;
		boolean boolvalue=bobj;
		
		System.out.println("----------------");
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(boolvalue);
		
		// storing null
		// int x =null; not allowed 
		Integer  x=null; //allowed
		
		
		//Collections: allowed only Wrapper classes
		
		// ArrayList <int>ar = new ArrayList(); not allowed
		
		// ArrayList<Integer> ar= new ArrayList();
		
		// Data Conversion using wrapper class  method
		
		
	}

}
