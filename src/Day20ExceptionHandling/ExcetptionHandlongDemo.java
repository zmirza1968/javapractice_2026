package Day20ExceptionHandling;

import java.util.Scanner;

public class ExcetptionHandlongDemo {

	public static void main(String[] args) {
	
		System.out.println("Program is started ");
		Scanner sc = new Scanner(System.in);
		
		// Example : ArithmeticException
		/*
		System.out.println("Enter a nubmer");
		int num=sc.nextInt();
		try
		{
		int res=100/num;
		System.out.println("Result :"+res); 
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Invalid input....");
		}
		*/
		
		
		/*
		
		System.out.println("Enter a string ");
		
	
		String value=sc.next();
		
		try {
		int valueInt=Integer.parseInt(value);		
		System.out.println(valueInt);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Invalid input");
			
		}
		*/
		/*
		
		//String s ="welcome";
		//String s ="";
		String s=null;
		
		
		
		try {
		
		System.out.println("Length of a String is :"+s.length());
		}
		catch(NullPointerException e) 
		{
			System.out.println("we cannot apply methods on nulls...");
		}
		*/
		
		
		int a[]= {10,20,30,40};
		
		
		try {
		
		System.out.println(a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array index not valid....");
		}
		
		System.out.println("program is executing..");		
		System.out.println("progrma is finished...");
		
	}

}
