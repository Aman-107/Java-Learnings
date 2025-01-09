package File_Handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Properties_read_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties property = new Properties();
		
		String filepath = System.getProperty("user.dir")+"\\Properties Data\\aman.properties";
		
		FileInputStream file = new FileInputStream(filepath);
		
		property.load(file);
		
		file.close();
		
		// Read data from properties file
		
		String age = property.getProperty("Age");
		String name = property.getProperty("Name");
		String email = property.getProperty("Email");
		
		System.out.println("Name " + name + " Age " + age + " Email " + email);
		
		// capture all the properties(keys) -> method1 (in string format)
		Set<String> keys = property.stringPropertyNames();
		System.out.println(keys);
		
		// capture all the values(keys) - method2 (in object format)
		Set<Object> allkeys = property.keySet();
		System.out.println(allkeys);
		
		// capture all values (in collection method of object format)
		Collection<Object> values = property.values();
		System.out.println(values);
		
		// read all the properties and their values
		for(String it : property.stringPropertyNames()) {
			System.out.println(it + " " + property.getProperty(it));
		}
		
	}

}

/*
Steps to read End to End ->

1. create property.
2. Extract the location for which property we want to read the file.
3. Open the file in reading mode.
4. Load the file.
5. Close the file.
6. Read the Data.


*/