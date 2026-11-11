package Day8StringClassMetrhod;

import java.util.Arrays;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		// 1. length()
		/*
		String str ="Welcome";
		//System.out.println(str.length());
		int len=str.length();
		System.out.println("Length of a string : "+ len);
		
		*/
		
		/*
		//charAt(index)
		String str ="Welcome";
		char ch=str.charAt(3);
		System.out.println("Character at index 3 :"+ch);
		*/
		
		/*
		
		// subString ()
		
		String s ="Welcome";
		
		//String substr=s.substring(1);
		//System.out.println(substr);
		
		String subStr= s.substring(3, 7);
		System.out.println(subStr);
		*/
		
		// contains()	returns true/false
		
		//String str ="Welcome";
		//boolean con=str.contains("Wel");
		//System.out.println(con);
		
		//boolean con=str.contains("came");
		//System.out.println(con);
		//boolean con =str.contains("CAME");
		//System.out.println(con);
		
		// equals() 
		
		/*
		String str1="welcome";
		String str2="welcome";
		String str3="java";
		String str4="WELCOME";
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // false
		
		System.out.println(str1.equals(str4)); // false
		
		// 7 equalsIgnoreCase()
		
		System.out.println(str1.equalsIgnoreCase(str4)); // true
		*/
		
		// LowerCase()	
		/*
		String str = "WelCome";
		System.out.println(str.toLowerCase());
		
		*/
		
		//ToUpperCase()
		/*
		String str = "WelCome";
		System.out.println(str.toUpperCase());
		*/
		
		// trim()
		/*
		String str ="   Welcome ";
		System.out.println(str.length()); // before trim
		
		String trim=str.trim();
		
		System.out.println(trim.length()); // after trim
		*/
		
		// replace() (old char, new char)
		/*
		String str ="Welcome";
		String replaceStr=str.replace('e','X');
		System.out.println(replaceStr);
		*/
		
		//replace("old string ","new String") replace multiple group of characters
		/*
		String str ="welcome to java";
		String replaceStr=str.replace("java","phyton");
		System.out.println(replaceStr);
		*/
		
		//String str ="Wel come";
		//System.out.println(str.replace(" ",""));
		
		// split()
		
		/*
		String str="hello world";
		String words []=str.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		*/
		
		/*
		String str ="abc@gmail.com";
		String words[] = str.split("@");
		System.out.println(words[0]);
		System.out.println(words[1]);
		*/
		
		
		/*
		String str="abc@gamil.com,xyz";
		
		String a[]=str.split(",");   //a[0]=abc@gamil.com a[1]=xyz;
		
		System.out.println(a[1]);
		
		String b[]=a[0].split("@");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		*/
		
		//indexOf(char) return an index of a character in a string 
		/*
		String str ="welcome";
		System.out.println(str.indexOf('m'));
		*/
		
		// indexOf(String)
		
		//String str ="welcome";
		//System.out.println(str.indexOf("come"));
		
		//startsWith(String)
		
		/*
		String str="hello world ";
		System.out.println(str.startsWith("hello"));
		System.out.println(str.startsWith("ello"));
		*/
		
		/*
		String str="Hello world";
		System.out.println(str.endsWith("world")); //true
		System.out.println(str.endsWith("worl")); // false
		
		*/
		
		// isEmpty
		/*
		String str ="";
		System.out.println(str.length());
		
		System.out.println(str.isEmpty());
		
		str="welcome";
		System.out.println(str.length());
		
		System.out.println(str.isEmpty());
		*/
		
		
		
		//toCharArray()
		/*
		String str ="welcome";
		char a[]=str.toCharArray();
		System.out.println(Arrays.toString(a)); //[w, e, l, c, o, m, e]
		*/
		
		
		//valueOf(Object)
		
		
		int n =123;
		String str=String.valueOf(n);
		System.out.println(str); // 123 is in String format
		
		String n1="10";
		String n2="20";
		
		//System.out.println((Integer.parseInt(n1)+Integer.parseInt(n2));
		System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));
		
		
		
		
		
		
		
	}

	

}
