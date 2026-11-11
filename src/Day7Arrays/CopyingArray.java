package Day7Arrays;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		
		int originalArray[]= {1,2,3,4,5};
		// Method 1 : looping statment 
		
		/*
		int copiedArray[]=new int [originalArray.length];
		
		for(int i=0;i<originalArray.length;i++) {
			copiedArray[i]	=originalArray[i];
		
		}
		System.out.println("Original array data :" +Arrays.toString(originalArray));
		System.out.println("Copied array data :" +Arrays.toString(copiedArray));
		*/
		
		// Method 2 using Arrays.copyOf()
		/*
	
		int copiedArray[]=Arrays.copyOf(originalArray, originalArray.length);
		System.out.println("Copied array data :" +Arrays.toString(copiedArray));
	*/
		
		// Method 3
		/*
		int copiedArray []= new int [originalArray.length];
		System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
		
		System.out.println("Copied array dat :"+Arrays.toString(copiedArray));
		*/
		
		
		// method 4 using clone () method
		int copiedArray[]=originalArray.clone();
		
		System.out.println("Original array data :" +Arrays.toString(originalArray));
		System.out.println("Copied array data :" +Arrays.toString(copiedArray));
	}

}
