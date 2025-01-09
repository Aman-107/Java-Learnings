package Try_Catch_Finaaly_Exception;
// one try can be followed by multiple catch blocks
// catch should be an immediate block after try

public class Try_catch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 7;
		
		try {
			// write the code in which we have doubt it will give error
			int k = a/0;
		}
		catch(Exception e){ // Exception e is general catch statement 'e' is object and can be named anything.
			System.out.println("It's an error needs to be handled " + e);
		}
		
		// handling multiple catch blocks
		
		try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } 
		catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } 
		catch (Exception e) {
            System.out.println("General exception: " + e);
        }
		
		finally {
			System.out.println("used in cookies, no matter code throws error still it will run and gives output ");
		}
        System.out.println("Program continues...");
    }
		
	}


/*

-> In Java, the try and catch blocks are used for exception handling to ensure the program runs smoothly even when errors occur. 
   The goal is to "try" code that might throw an exception and "catch" the exception to handle it gracefully.
-> This is generally used to handle pop-up in pages while automating via selenium.

-> How try and catch Work

-> try Block:
* Contains code that might throw exceptions.
* If an exception occurs, the program control is transferred to the corresponding catch block.

-> catch Block:
* Contains code to handle the exception.
* We can define specific or general exceptions in the catch block.

-> Key Points
* We have multiple catch blocks to handle different exception types.
* The catch blocks are executed in order, starting with the most specific exception.
* If no exception occurs, the catch block is skipped.

-> Finally 
* will work if try and catch present or not.
* The finally block is optional and is always executed, regardless of whether an exception is thrown or caught.
* Generally used to delete cookies after each session in selenium automation.
* To stop finally block from execution is to manually forcefully stop the JVM while the code is executing before it reaches to finally block.

*/