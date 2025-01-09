package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FH_CSV_File_Reading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Approach using Scanner Class - Method 1
		
//		File filepath = new File(System.getProperty("user.dir")+"\\Properties Data\\aman.csv"); 
//		// here String is not used since we are going to work on file i.e.csv hence 'File filepath = ...'
//
//		Scanner csv1 = new Scanner(filepath);
//		
//		csv1.useDelimiter(",");  // using to identify where the text got separated i.e. different text 
//		
//		while(csv1.hasNext()) {  
//			System.out.print(csv1.next() + "\t");
//		}
//		csv1.close();
	
		
		// Aproach2 : Using java split() method i.e. buffered reader
		
		String csv2 = System.getProperty("user.dir")+"\\Properties Data\\aman.csv";
		FileReader filepath2 = new FileReader(csv2); 
		// using collection FileReader since we are going on BufferedReader which accepts FileReader files
		
		BufferedReader bfreader = new BufferedReader(filepath2);
		String line;
		
		while((line = bfreader.readLine()) != null) {  // storing each line in the string line.
			String data[] = line.split(",");           // splitting the line using delimiter(",")
			for(String value : data) {                 
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		
		
	}

}
