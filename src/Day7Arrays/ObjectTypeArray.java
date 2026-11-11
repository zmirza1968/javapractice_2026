package Day7Arrays;

import java.util.Arrays;

public class ObjectTypeArray {

	public static void main(String[] args) {
	
		//int a[]= new int[5];
		
		//String s[]=new String[5];		
		
		//Object a[]= new Object [5];
		
		// String is drive data type
		
		//int a=10;
		//double d=105;
		//boolean b =true;
		//char c = 'A';
		//String s ="Welcome";
		
		// Object is root class  
		
		Object a[]= new Object [5];// can store object type of data Integer, Double,Boolean ,Character,String
		a[0]=10;
		a[1]=10.5;
		a[2]='A';
		a[3]="welcome";
		a[4]=true;
		
		//System.out.println(a[1]);
		/*
		System.out.println(a[0].getClass().getSimpleName());
		System.out.println(a[1].getClass().getSimpleName());
		System.out.println(a[2].getClass().getSimpleName());
		System.out.println(a[3].getClass().getSimpleName());
		System.out.println(a[4].getClass().getSimpleName());
		*/
		
		// reading data from array using for loop
		/*
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
		
		// reading data from array using for each loop
		
		/*
		for(Object value :a) 
		{
			System.out.println(value);
		}
		*/
		// read data from arrya without using loop
		
		System.out.println(Arrays.toString(a)); //[10, 10.5, A, welcome, true]
		
		/*
		1. Object Type Array
		2.Sorting an Array
		3. Searching for an Element in an Array
		4.Copying an Array
		5. Comparing the Equality of two Arrays
		*/
		
		
	}

}







