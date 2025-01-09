package Basics.java;

public class Vaiables_Data_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int am = 7; // integer 'int' is primitive data type
//		String website = "MRJ Jewellers"; // string is non-primitive data type
//		char letter = 'r';
//		double dec = 1.243;
//		boolean myCars = true;
//		
//		//System.out.println(am + "is the value stored as integer"); 
		
		int[] arr = {1,3,5,7,9};
		
		System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        
        
        for(int i=(arr.length-1); i>=0; i--){
            System.out.println(arr[i]);
        }
        
        System.out.println(arr.length);
	
	
	
	}

}
