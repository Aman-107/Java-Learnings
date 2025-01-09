package final_keyword;

public class final_parent {

/*-> class name as final i.e. 'final class final_parent' instead 'public class final_parent' -> it means we cannot extend that 
	 class i.e. we can't use that class as inheritance as parent child class.  */
	
	final void getData() {
		
	}
/*-> when any method has used final keyword then that method can't be used for 'override'	
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i = 4; // constant variable i.e. it value now can't be alerted or updated 
	}

}
