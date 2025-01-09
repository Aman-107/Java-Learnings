package Acces_modifiers;

import Basics.java.Methods;
import Basics.java.Strings_questions;

public class publi_access_modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Strings_questions mt = new Strings_questions();
		mt.abc123 = "Public h ji";
		
		Methods mt1 = new Methods();
		mt1.methods1();
		
	}

}

/*
public, private, protected, default

-> default   : access method anywhere but only in package.
-> protected : variable/method as protected then we can access those in sub classes only for other packages via inheritance .  
-> public    : variable/method as public then we will have access across all packages.
-> private   : we can not access method or varibale out side of same package


*/


/* CHAT GPT NOTES :: Refer this for better understanding above one is bit confusing 
 Saved in Downloads -> Java Learning -> Access Modifiers
 */
