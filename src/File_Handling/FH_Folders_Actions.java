package File_Handling;

import java.io.File;  // package for file handling

public class FH_Folders_Actions {
	
	public static void createfolder(String folderpath) {  // creation of folder
		File folder = new File(folderpath);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		System.out.println("Folder created : " + folderpath);
	}
	
	public static boolean folderexist(String folderpath) {  // Checking if folder exists or not
		File folder = new File(folderpath);
		
		return folder.exists();
	}
	
	public static void renamefolder(String oldfolderpath, String newfolderpath) { // renaming of folder
		File oldfolder = new File(oldfolderpath);
		File newfolder = new File(newfolderpath);
		
		if(oldfolder.exists()) {
			oldfolder.renameTo(newfolder);
			System.out.println("Folder renamed to :" + newfolderpath);
		}
	}
	
	public static void deletefolder(String folderpath) {  // deleting the foldder
		File folder = new File(folderpath);
		
		if(folder.exists()) {
		for(File it : folder.listFiles()) { // this is used to empty the folder files
			it.delete();
		}
		folder.delete(); // this will only work when folder is empty
		System.out.println(folderpath + " Folder got Deleted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String folderpath = "C:\\Users\\akthe\\eclipse-workspace\\Java Learning\\src\\File_Handling\\folder1";
		String newfolderpath = "C:\\Users\\akthe\\eclipse-workspace\\Java Learning\\src\\File_Handling\\renamed";
	// folder path where to do the operation and at last is the name to keep for the folder
		
		FH_Folders_Actions.createfolder(folderpath);
		System.out.println("Folder Exists : " + FH_Folders_Actions.folderexist(folderpath));
		FH_Folders_Actions.renamefolder(folderpath,newfolderpath);
		deletefolder(newfolderpath); // calling without using class name this is OK but always use object or classname to call method
			
		/* file Handling in Java
		* Create a folder
		* Check if a folder exists
		* Rename a folder
		* Delete a folder  */

	}

}
