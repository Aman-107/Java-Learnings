package Static_concepts;

public class static_variable {

	String name;
	String street;
	int i = 0;
	String city;
	// Instance Variable -> values changes till the function executes, once gets out of fn value resets to original i.e. 'i=0'
	
	static String gender = "Male"; 
	static int k =0;
	static String college;
	static double cgpa;
/*  -> A static variable is shared among all instances of the class. It is initialized only once, at the start of the program, 
   and is stored in the class area of memory.
-> It's often used for constants or for data that should be shared among all instances of the class.
-> Static Variable -> values changes when the fn executes, once gets out of fn value remains the changed i.e. 'k=0, k=1, k=2(initialised)'
-> Static Variable are also called as class variable  */	
	
	static {
		college = "Thapar University";
		cgpa = 7.4397;
	}
	// static block -> used to initialise static variable at a single block to look code optimize. 
	
	public static_variable(String name, String street, String city) {
		// here we have not assigned the gender value nor passed it still we are able to use in city name fn due to static keyword
		this.name = name;
		this.street = street;
		this.city = city;
		i++;
		k++;
		System.out.println("I value " + i + " K value" + k);
		/* here in output we can see that i changes to 1 only k changes to 1 then 2, since k is static hence it's storing the value
		 globally where as 'I' is instance variable thatswhy rests to initial value i.e. 0 after execution of fn. */
		
		int aman; // local variable
	}
	
	public void getCityName() {
		System.out.println("City Name " + city + " and gender is " + gender);
	}
	
	public static void getGender() {
		// static method will only accept static variables.
	//	System.out.println(city);  //throw error since city is not static variable.
		System.out.println(gender);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		static_variable obj = new static_variable("Aman", "Tadiya", "Varanasi" /*, "Male"*/);
		static_variable obj1 = new static_variable("Shadow", "Adarsh Nagar", "Patiala"/*, "Male"*/);
		obj.getCityName();
		obj1.getCityName();
		
		static_variable.getGender(); // here we have called gender fn by class name only since it's static method hence it doesn't depend on class object
		
	}

}

/* NOTES
Key Points to Remember

Static Variables:

-> Shared among all instances.
-> Useful for constants and counters.

Static Methods:

-> Belong to the class, not instances.
-> Cannot access non-static members directly.

Static Blocks:

-> Execute when the class is loaded into memory.
-> Useful for static initialization.

Static Nested Classes:

-> Can access static members of the outer class.
-> Cannot access non-static members of the outer class directly.

Memory Management:

-> Static members are stored in the method area (class area) of memory.

When to Use static?
-> Use static for utility or helper methods (e.g., Math.pow()).
-> Use static variables for constants or shared resources (e.g., a global counter or configuration settings).
-> Use static nested classes to logically group classes that don't require an instance of the outer class.
 
 */
