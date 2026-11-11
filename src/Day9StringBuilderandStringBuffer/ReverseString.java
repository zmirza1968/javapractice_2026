package Day9StringBuilderandStringBuffer;

public class ReverseString {

	public static void main(String[] args) {
	
		
		// Approach 1 length() cahrAt()
		
		/*
		String s ="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		/*/
		
		
		// Approach By converting String to char type array toCharArray
		/*
		String s="welcome";
		char a[]=s.toCharArray();
		
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
		
		/*
		String s ="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
	
	*/
		// method 2 BY converting string to char type array toCharArray()
		
		/*
		String s="welcome";
		String rev="";
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) 
		{
			rev=rev+(a[i]);
		}
		System.out.println("Reverse String : "+ rev);
		*/
		
		
		// Method 3 : using StringBuffer
		
		StringBuffer s = new StringBuffer("welcome");
		String rev=s.reverse().toString();
		
		//System.out.println("Reverse String is  :"+s.reverse());
		System.out.println("Reverse String is  :"+rev);
		
		//StringBuilder a = new StringBuilder("HELLO");
	//	System.out.println("Reverse String is :"+a.reverse());
	}

}


















