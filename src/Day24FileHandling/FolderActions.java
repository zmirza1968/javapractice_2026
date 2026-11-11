package Day24FileHandling;

import java.io.File;
// create a folder
// check if a folder exists
// rename a folder
// delete a folder

public class FolderActions {

	public static void createFolder(String folderPath) {
		
		
		// create a folder
		File folder = new File("C:\\myfiles");

		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created :" + folder.getName());
		}

	}
	
	
	
	public static boolean checkFolderExist (String folderPath) 
	{
		File folder = new File(folderPath);
		folder.exists();
		return folder.exists();
		
	}
	
	// rename a folder
	
	public static void renameFolder(String oldFolderPath, String newFolderPath) {
		
		File oldFolder = new File(oldFolderPath);
		File newFolder = new File(newFolderPath);
		
		if(oldFolder.exists())
		{
			oldFolder.renameTo(newFolder);
			System.out.println("Folder renamed to :"+newFolder.getName());
		}
	}
	
	
	public static void delteFoder(String folderPath) 
	{
		
		File folder = new File(folderPath);
		
		if(folder.exists())
		{
			
			for(File file :folder.listFiles())
			{
		file.delete();
		
				
			}
			folder.delete();
			System.out.println("Folder deleted :"+folder.getName());
		}
		
	}

	public static void main(String[] args) {

		createFolder("C:\\myfiles");
		
		boolean folderexists=checkFolderExist("C:\\myfiles");
		System.out.println("Folder exist :"+folderexists);
		
		renameFolder("C:\\myfiles", "C:\\myfiles2");
		
		delteFoder("C:\\myfiles2");
		
	
	}

}
