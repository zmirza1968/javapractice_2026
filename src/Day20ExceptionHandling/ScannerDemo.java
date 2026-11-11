package Day20ExceptionHandling;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
	//	Scanner sc =new Scanner(System.in);
		/*
		
		System.out.println("Enter name :");
		String name=sc.next();
		
		System.out.println(name);
		*/
		
		// Characater input
		
		
		/*
		System.out.println("ENter gender");
		char gender =sc.next().charAt(0);
		
		
		System.out.println("Gender :"+gender);
		
		*/
		
		
		//Numeric data type 
		/*
		System.out.println("Enter age ");
		int age=sc.nextInt();
		System.out.println("Age is :"+age);
		
		System.out.println("Enter mobile number ");
		Long mobile =sc.nextLong();
		
		System.out.println("Enter mobile number :"+mobile );
		
		*/
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter price of an item :");
		double d=sc.nextDouble();
		System.out.println("Price of an item is :"+d);
	}

}
