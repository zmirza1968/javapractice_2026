package OnlyPractice;

public class Printnumber1to10 {

	public static void main(String[] args) {

		// Program1: Print Numbers from 1 to 10

		/*
		  int i=1; while(i<=10) 
		  { 
		  System.out.println(i); i++;
		 */
		
		
		
		// Program2: Sum of First 10 Natural Numbers
		/*
		  int i=1, sum =0; while(i<=1) {
		  
		  sum+=1; i++; } System.out.println( "sum :"+sum);
		 */

		// Program1 3: Factorial of a Number

		/*
		  int number = 5; // Example number int factorial = 1; int i = 1; while (i <=
		  number) { factorial *= i; i++; } System.out.println("Factorial of " + number
		  + " is: " + factorial);
		 */
		
		

		// Program 4: Reverse a Number

		/*
		  int number =12345;
		   int rev=0; while(number !=0) 
		   { 
		   int digit =number%10;
		  rev=rev*10+digit; number/=10; } 
		 
		  System.out.println(" Reversed Number :"+rev);
		 */

		// Program 5: Count the Digits in a Number
		/*
		  int number =1234567;
		   int count =0; while (number!=0)
		    { 
			number/=10;
			 count ++;
		  }
			System.out.println(" Number of digits "+count);
		 */
		
		
		
		// Program: 6 Check if a Number is Prime
		
		
		int number = 29;
		boolean isprime = true;
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) {
				isprime = false;
				break;
			}
			i++;
		}
		if (isprime) {
			System.out.println(number + " is a prime number..");
		} else {
			System.out.println(number + " is not a prime number ");
		}

	}

}
