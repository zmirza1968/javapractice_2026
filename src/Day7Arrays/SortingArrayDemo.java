package Day7Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayDemo {

	public static void main(String[] args) {
		
		// Sorting elements - int ascending order
		
		/*
		int numbers []= {4,2,7,1,9};
		System.out.println("Before sorting "+ Arrays.toString(numbers));//Before sorting [4, 2, 7, 1, 9]
		
		Arrays.sort(numbers);
		System.out.println("After sorting "+ Arrays.toString(numbers));//After sorting [1, 2, 4, 7, 9]
		
		*/
		//sorting elements -String 
		
	String names[]= {"john","smith","david","candey"};
	Arrays.sort(names);
	System.out.println(Arrays.toString(names));
	
	// Sortng elements in descending order
	
	Integer ids[]= {100,500,200,400,300};
	System.out.println("Before sorting "+ Arrays.toString(ids));
	Arrays.sort(ids,Collections.reverseOrder());
	
	System.out.println("After sorting "+ Arrays.toString(ids));

	}

}
