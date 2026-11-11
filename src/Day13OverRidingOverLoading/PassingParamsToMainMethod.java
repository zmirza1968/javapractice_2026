package Day13OverRidingOverLoading;

import java.util.Arrays;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
		
		System.out.println("Length of an array :"+args.length);
		System.out.println("array data :"+Arrays.toString(args));
		
		for(String s:args) {
			System.out.println(s);
		}
	}

}
