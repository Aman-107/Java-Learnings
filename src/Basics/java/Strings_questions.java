package Basics.java;

public class Strings_questions {

	public String abc123 = "Access Modifiers";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// to validate whether the string is palindrome or not
		// Print the String in reverse order
		
		String ab = "shadow";
		String pali ="";
		  
		for ( int i=ab.length()-1 ; i>=0; i-- ) {
			pali += ab.charAt(i);                             // reversing of string
		}
		
		if(pali == ab)                                        // validation of palindrome
			System.out.println("It is Palindrome String " + pali);
		else
			System.out.println("String is not a Palindrome " + pali );
		// Print the unique number from the list - Amazon.
	}

}
