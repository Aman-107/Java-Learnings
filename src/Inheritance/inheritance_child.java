package Inheritance;

public class inheritance_child extends inheritance_intro { 
	// we are using 'extends parentname' keywords to inherite the property of parent to child class
	
	
	public void engine() {
		System.out.println("This is new generation engine");
	}
	
	public void colour() {
		System.out.println(color);
	}
	// calling the color variable from parent class i.e. inheritance_intro
	
	public static void main(String[] args) {
		
		inheritance_child cc = new inheritance_child();      
		// here we use the same class name for creation of object unlike of interface
		
		// cc.color(); //since this is a variable in parent class 
		/* 
		it will throw an error bcoz 
		Unresolved compilation problem: 
		The method color() is undefined for the type inheritance_child 
		*/
		cc.brakes();
		cc.audiosystems();
		cc.colour();
	}

}
