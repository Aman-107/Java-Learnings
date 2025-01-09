package Basics.java;

public class Parent_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print in java (sysout -> ctrl + spacebar)
		//System.out.println("I have started learning java");
	
		// sum of two numbers
		
		int a = 5, b = 6;
		int c = a+b;
		//System.out.println("sum of two number is " + c);
		
		Methods m = new Methods();       // creation of object for the methods class
		System.out.println(m.methods1());  // calling the class value by object
		System.out.println(m.methods());
	}

}
