package Arrays;

public class Array_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int[5];
		// Declaring an array and allocates memory for the values (fixed size)
		a[0] = 9;
		a[1] = 5;
		a[2] = 7;
		a[3] = 1;
		a[4] = 1;
		// initialising values into array
		//a[5] = 1;
		
		for(int i=0; i<a.length; i++) 
		// not to use length() function when array is of fixed size == error -> Cannot invoke length() on the array type int[]
			{
			System.out.println(a[i]);
			// retrieves values present in the array
		}
		
		int b[] = {9,7,9,3,4,4,5}; // dynamic allocation of memory
	}

}


/*
  Array -> A container which stores multiple values of same data type
 
 
 */
