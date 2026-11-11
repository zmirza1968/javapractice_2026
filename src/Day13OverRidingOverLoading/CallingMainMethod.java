package Day13OverRidingOverLoading;

import java.util.Arrays;
// By default JVM will call the main method Iteration 1

public class CallingMainMethod {

	public static void main(String[] args) {
		
		
		System.out.println("Lenght of array :"+args.length);
		
		System.out.println("Data in Array :" +Arrays.toString(args));
		
	
		if (args.length == 0) {

		    String ar[] = {"welcome", "to", "java"};

		    main(ar);
		}
		}
		
	}

