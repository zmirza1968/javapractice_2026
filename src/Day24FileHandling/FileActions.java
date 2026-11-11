package Day24FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
  create a file
  writing content into file
  reading content from the file
  rename a file
  delete file
*/



public class FileActions {
	
	public static void createFile(String filePath) 
	{
		File fileObj = new File(filePath);
		
		try
		{
			if(fileObj.createNewFile())
			{
				System.out.println("File is created :"+fileObj.getName());
			}
			else
			{
				System.out.println("File is already exists....");
			}
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
	
	
	
	public static void writeFile(String fielPath)
	
	{
		try
		{
		FileWriter mywriter = new FileWriter(fielPath);
		
		mywriter.write("Welcome to java ");
		mywriter.append("Demostrating file handling concept... ");
		
		mywriter.close();
		
		System.out.println("Successfully wrote the content in the file");
		}
		catch(IOException e)
		{
			System.out.println("An error occured..");
			e.printStackTrace();
		}
	}
	
	
	public static void readFile(String filePath) 
	
	{
		
		try
		{
		File myobj = new File(filePath);					
		Scanner	sc = new Scanner(myobj);			
		while(sc.hasNextLine())
		{
			String content=sc.nextLine();
			System.out.println(content);
		}
		sc.close();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

	
	
	
	//  rename a file
	
	public static void renameFile(String oldFilePath, String newFilePath) {
		
		File oldfile = new File(oldFilePath);
		File newfile= new File(newFilePath);
		
		if(oldfile.renameTo(newfile))
		{
			System.out.println("File is renamed "+newfile.getName());
		}
		else
		{
			System.out.println("The file cannot be renamed ..");
		}
	}
	
	
	// delete the file
	
	public static void deletFile(String filePath)
	{
		
		File myobj = new File(filePath);
				if(myobj.delete()) {
					System.out.println("Deleted the file .."+myobj.getName());
				}
				else
				{
					System.out.println("Failed to delte the file..");
				}
		
	}
	
	public static void main(String[] args) {
		
	//	createFile("C:\\myfile\\test.txt");
		
		//writeFile("C:\\myfile\\test.txt");
		
	//	readFile("C:\\myfile\\test.txt");
		
		
		//renameFile("C:\\\\myfile\\\\test.txt","C:\\myfile\\testnew.txt");
		deletFile("C:\\myfile\\testnew.txt");
	}

}












