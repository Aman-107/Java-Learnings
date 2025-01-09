package Basics.java;

public class Strings {

	// String is an object in Java that represent sequences of characters.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Payments $200 is done";
		
		String [] splittedstring = str.split("200"); // str.split(" ") -> for splitting on white space
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());  //.trim() remaoves all the whitespaces before and after of the string 
		
		
		System.out.println(str.charAt(7));               // str.charAt(index)   -> to find the character present at that specific position
		System.out.println(str.indexOf("done"));         // str.indexOf("char") -> to find the position of specific character/String
		
		// in both the cases it counts white space also + numbering start from 0th index
		
		System.out.println(str.substring(8));           // str.substring(index) -> to print the substring from that position 
	
		for(int i=str.length()-1; i>=0; i--) {      // to print the string in reverse order
			System.out.print(str.charAt(i));
		}
		
	}
}		
		
	/*No. of ways to define String : 
	 1. String Literals
	 String s = "Aman";
	 String s2 = "Aman"; // this will use the existing object if the values are same.
	 
	 2. By new keyword i.e. new memory allocator.
	 String s3 = new String("Shadow");
	 String s4 = new String("Shadow"); // this will explicitly create a new objectthough same values are present.
	 *  
	 *  
	 *  */
	
