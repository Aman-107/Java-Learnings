package File_Handling;

// in file handling whatever action we are doing it has to be written in try catch block

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Actions {

	public static void createfile(String filepath) {  // creating a file
		File file = new File(filepath);
		try {
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File got created with name : " + filepath);
		}
		else {
			System.out.println("Unable to create File");
		}
		}
		catch (IOException e) {
			System.out.println("An error occured while creation of file..");
			e.printStackTrace();
		}
	}

	public static void writedatainfile(String filepath) { // Writing in the file
		try {
		//FileWriter file = new FileWriter(filepath); // FileWriter is the collection
		// it will delete all the data present in the file and will start with a fresh line that has been passed
		
		FileWriter file = new FileWriter(filepath, true); // this append the text in the existing file.
		
		file.write("Welcome to Java file handling ... \n");
		file.close();
		System.out.println("Successfully wrote in the file...");
	}
	catch(IOException e) {
		System.out.println("An error occured while writing..");
		e.printStackTrace();
		}
	}

	public static void renamefile(String oldfilepath, String newfilepath) { // Renaming the file
		File oldfile = new File(oldfilepath);
		File newfile = new File(newfilepath);
		
		if(oldfile.exists()) {
			oldfile.renameTo(newfile);
			System.out.println("Renamed " + oldfilepath + " to " + newfilepath );
		}
		else {
			System.out.println("Unable to Rename the file ");
		}
		
	}
	
	public static void readdata(String filepath) {  // Reading the data i.e. printing in console
		try {
		File read = new File(filepath);
		
		Scanner reader = new Scanner(read); // to read a object we use scanner class
		
		while(reader.hasNextLine()) {
			String data = reader.nextLine();
			System.out.println(data);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occured while reading...");
			e.printStackTrace();
		}
	}
	
	public static void deletefile(String filepath) {
		File delete = new File(filepath);
		
		if(delete.exists()) {
			delete.delete();
			System.out.println("File got Deleted..");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filepath = "C:\\Users\\akthe\\eclipse-workspace\\Java Learning\\src\\File_Handling\\File_Handling\\aman_file.txt";
		// Syntax -> file_path\\file_name.extension 
		File_Actions.createfile(filepath);
		File_Actions.writedatainfile(filepath);
		
		String newfilepath = "C:\\Users\\akthe\\eclipse-workspace\\Java Learning\\src\\File_Handling\\File_Handling\\aman_file_shadow.txt";
		File_Actions.renamefile(filepath,newfilepath);
		File_Actions.readdata(newfilepath);
		
		String deletefile = "C:\\Users\\akthe\\eclipse-workspace\\Java Learning\\src\\File_Handling\\File_Handling\\aman_file";
		File_Actions.deletefile(deletefile);
	}
	/* Create the file
	 * Write data in the file
	 * Rename the file
	 * Read data from the file
	 * Delete the file   */

}
