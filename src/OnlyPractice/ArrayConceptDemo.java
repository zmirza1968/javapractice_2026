package OnlyPractice;

public class ArrayConceptDemo {

	public static void main(String[] args) {
		/*
		1. Write a program to find the largest element in a given array.
		Sample Input:
		int[] numbers = {4, 2, 7, 1, 9};
		Expected Output:
		Largest Element: 9
		*/
		
		/*
		int numbers []= {4,2,7,1,9};
		int largest =numbers[0];
		
		for(int i=1; i<numbers.length;i++) 
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
		}
		System.out.println("largest Element : "+ largest);
			
	*/
		
		/*
		2. Write a program to find the smallest element in a given array.
		Sample Input:
		int[] numbers = {4, 2, 7, 1, 9};
		Expected Output:
		Smallest Element: 1
		*/
		
		int numbers[]= {4,2,7,1,9};
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<smallest) 
			{
				smallest=numbers[i];
			}
		}
		System.out.println("Smallest Element : "+smallest);
	}

}
