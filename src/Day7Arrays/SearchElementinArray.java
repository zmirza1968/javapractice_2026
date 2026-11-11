package Day7Arrays;

import java.util.Arrays;

public class SearchElementinArray {

	public static void main(String[] args) {
		
		
		//Searching for an Element in an Array
		// Linear search
		
		/*
		int numbers []= {5,10,6,7,3,2};
		
		int searchElement=2;
		boolean status =false;
		for(int i=0;i<numbers.length;i++)
		{
			//System.out.println(numbers[i]);
			if(numbers[i]==searchElement) 
			{
				System.out.println("Element fond at : "+ i);
				status =true;
				break;
			}						
		}
		
		
		if(status ==false)
		{
			System.out.println("Element not found  ");	
		}	
		*/
		
		
		// Binary search (works with only sorted array)
		
		//int numbers []= {10,20,30,40,50}; // sorted array
		/*
		int numbers []= {50,40,30,20,10}; // unsorted array
		Arrays.sort(numbers); // first we need to sort 
		int searchElement =30;
		int i =Arrays.binarySearch(numbers, searchElement);
		
		if(i>=0)
		{
			System.out.println("Element found at "+i);
		}
		else
		{
			System.out.println("Element not found ");
		}
		*/
		
		int num[] = {50, 80, 30, 40, 80, 90, 100};
		int searchElement = 50;
		int index = -1;

		// Loop through the array to find the item in its original spot
		for (int i = 0; i < num.length; i++) {
		    if (num[i] == searchElement) {
		        index = i;
		        break; // Stop looking once found
		    }
		}

		if (index >= 0) {
		    System.out.println("Element found at original index: " + index);
		} else {
		    System.out.println("Element not found...");
		}

	}
}


