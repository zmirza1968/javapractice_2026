package Day24FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
	
		
		Properties prop = new Properties();
		
		// Create a FileInputStream to read the file properties file
		FileInputStream file = new FileInputStream("C:\\Automation\\myworkspace\\JavaPractice\\myproperties.properties");
		
		// Load the properties from the file
		prop.load(file);
		file.close();
		//Retrive value using prop objec
		String myname=prop.getProperty("name");
		String myemail=prop.getProperty("email");
		String myage =prop.getProperty("age");
		
		
	//	System.out.println(myname+ "  " +myemail+ "  " +myage);
		
		Set <String> allKeys =prop.stringPropertyNames();
		
		
		
		System.out.println(allKeys);
		
		Collection <Object>values=prop.values();
		System.out.println(values);
		
		 for(String key:prop.stringPropertyNames())
			 
		 {
			 System.out.println(key+ " "+prop.getProperty(key));
		 }
	}

}
