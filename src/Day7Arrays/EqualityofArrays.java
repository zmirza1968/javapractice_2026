package Day7Arrays;

import java.util.Arrays;

public class EqualityofArrays {

	public static void main(String[] args) {
		
		int array1[]= {1,2,3,4,5};
		int array2[]= {1,2,3,4,5};
		int array3[]= {10,20,30,40,50};
		
		//Method1 using Arrays.equals()
		
		//boolean result=Arrays.equals(array1,array3);
		
		//System.out.println(" Are Array 1 and Array3 equal ?" +result);
		
		// Method 2 using a loop 
		
		boolean result=true;
		
		if(array1.length!=array3.length)
		{
			result=false;
		}
		else {
			for(int i=0; i<array1.length;i++)
			{
				if(array1[i]!=array3[i]) {
					result =false;
					break;
				}
				
			}
		}
		
		
		System.out.println(" Are Array 1 and Array3 equal ?" +result);
		

	}

}
