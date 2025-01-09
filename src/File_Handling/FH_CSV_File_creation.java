package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class FH_CSV_File_creation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath = System.getProperty("user.dir")+"\\Properties Data\\aman.csv";
		
		FileWriter writer = new FileWriter(filepath);
		
		writer.append("Name \t, Age \t, Email \t, Address \n");  // heading
		writer.append("Aayansh \t, 0.2 , aayansh@gmail.com \t, Lucknow \n");
		writer.append("Aman \t, 25 \t, aman@gmail.com \t, Varanasi \n");
		writer.append("Madan \t, 52 \t, mk@gmail.com \t, Bhagwanour \n");
		writer.append("Meera \t, 48 \t, meera@gmail.com \t, Chituara \n");
		writer.append("Anchal \t, 29 \t, anchal@gmail.com \t, Harsosh \n");
		
		writer.close();
		
		System.out.println("CSV file created at " + filepath);
	}

}
