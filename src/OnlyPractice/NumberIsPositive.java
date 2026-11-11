package OnlyPractice;

import java.util.Scanner;

public class NumberIsPositive {

	public static void main(String[] args) {

		// Program 1: Check if a number is positive

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an interger :");

		int num = scanner.nextInt();
		if (num > 0) {
			System.out.println("the number is positive");
		} else {
			System.out.println("The nubmer is not positive");
		}

		scanner.close();

	}

}

    
