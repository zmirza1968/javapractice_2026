package Day20ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CheckedExceptions {

	public static void main(String[] args) throws IOException  {
		
		try 
		{

            FileReader file = new FileReader("C:\\Automation\\text\\test.txt");

            BufferedReader reader = new BufferedReader(file);

            System.out.println(reader.readLine());

            reader.close();

        } catch (IOException e) {

            System.out.println("File could not be read.");
            System.out.println(e.getMessage());           
           
        }
        
		
		 // FileReader file = new FileReader("C:\\Automation\\text\\test1.txt");
		// System.out.println(new BufferedReader(file).readLine());
		
    }
}
