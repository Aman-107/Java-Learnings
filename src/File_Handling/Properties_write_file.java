package File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_write_file {
// we write this in main class i.e. properties code -> keep in mind
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties property = new Properties();  // Properties collection
		
		property.setProperty("Name", "Aman");  // set property used to save the data in property and it uses key value pair
		property.setProperty("Name", "Shadow");
		// does not accept duplicate keys hence overwrites it
		property.setProperty("Age", "25");
		property.setProperty("Email", "akthemaurya1999@gamil.com");
		
		String filepath = System.getProperty("user.dir")+"\\Properties Data\\aman.properties"; 
/*  This line is used to store the property file in which directory.
*  'Properties Data' has been created manually/explicitly to store the property data's.
* '.getProperty("user.dir")' -> this give the current package location in which user is working '+' folder_name\\name_ofpackage
*/
		FileOutputStream file = new FileOutputStream(filepath);
		
		property.store(file, "My first property creation");
		file.close();
		
		System.out.println("Properties have been written into " + filepath);
		
	// FileInputStream -> used to open the file in reading so that we can write data back in file. 
	// FileOutputStream	-> used to write data in the file of property.
	
	
	}

}
/*
 
Steps End to End -> 

1. Create property.
2. Add objects to the property.
3. Save the property in the directory.
4. Convert the file to write / read it.
5. Store the file with some comments.
6. Close the file

*/
