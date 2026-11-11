package Day9StringBuilderandStringBuffer;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		/*
		StringBuilder
		• StringBuilder is a mutable sequence of characters that can be modified without creating new
		objects.
		
		• Introduced in Java 5.
		
		• Common Methods:
		o append(): Adds text to the end of the existing string.
		o insert(): Inserts text at a specified index.
		o replace(): Replaces text between specified indices.
		o delete(): Removes text between specified indices.
		o reverse(): Reverses the sequence of characters.
		o toString(): Converts the StringBuilder to a String.
		*/
		
		
		//
		//String s= new String ("welcome");
		//String s1 ="welcome";
		
		//StringBuffer
		//StringBuffer s ="welcome"; // not possible 
		
		
	//	StringBuffer s = new StringBuffer("hello");
		StringBuilder s= new StringBuilder("Hello");
		
		//Append():
		
		s.append(" world");
		System.out.println(s); //hello world
		
		// Insert()
		s.insert(5, ",");
		System.out.println(s); //hello, world
		
		
		// replace();
		s.replace(5, 6, "!");
		System.out.println(s);
		
		//delete()
		
		s.delete(5, 6);
		System.out.println(s);
		
		//reverse():
		s.reverse();
		System.out.println(s);
		
	}
}
		
		
		

