package Inheritance;

public class inheritance_intro { // it is parent class
	
	String color = "red";
	
	public void gear() {
		System.out.println("This is the gear section");
	}
	
	public void col() {
		System.out.println("This is the colour section");
	}
	
	public void brakes() {
		System.out.println("This is the brakes section");
	}
	
	public void audiosystems() {
		System.out.println("This is the audiosystems section");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
inheritance does not allow methods in main class
we cannot inherite multiple class names in java though it's possible in C++ i.e. 'class z extends x,y' -> "not possible"

Here Example taken are : 

existing generation vehicle - parent 
color
gear
breaks
audiosystems

New generation vehicle - child
engines


Interview Question tricky -> 

class A{
int i = 10; 
}
class B extends A{
int i = 20;
}

public class Mainclass{
public static void main(String[] args){
	A a  = new B();
	
	System.out.println(a.i);  // here output will be 10 since it's calling the object of A though it's inheriting the B class 
}
}


*/