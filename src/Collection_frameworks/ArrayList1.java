package Collection_frameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
/*-> can accept duplicate values
 -> ArrayList,LinkedList, Vector - Implementing List interface
 -> Array have fixed size where as ArrayList can grow dynamically
 -> We can access and insert any value in any index  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<String>();// Creating an ArrayList
		ar.add("Aman");
		ar.add("Kumar");
		ar.add("Maurya");
		// Adding Elements
		System.out.println(ar);

		ar.add(0, "Shadow"); // Inserting at a Specific Index
		
		if (ar.get(1) != null) { // Null case handling
		    System.out.println(ar.get(1));
		}
		
		System.out.println(ar);
		ar.remove(3); // Removing the element at index 3
		System.out.println(ar);
		ar.remove("Kumar");
		System.out.println(ar);
		
		if (ar.size() > 2) { // Edge case handling
		    System.out.println(ar.get(2)); //Accessing the element at index 2
		}
		
		System.out.println(ar.contains("shadow")); // Checking Element Existence
		System.out.println(ar.contains("Shadow".toLowerCase())); // Adjust if needed -> case sensitive handling 
		System.out.println(ar.indexOf("Aman")); // Finding Index of an element
		System.out.println(ar.isEmpty()); 
		System.out.println(ar.size());
		
		int array[] = {1,2,3,4,5,6,7,8,11,9};
		
//		List<int[]> newarray = Arrays.asList(array);  // this will work in case of String bcoz it is non primitive data type
//		System.out.println(newarray.contains(11));
	/*	
		Why Arrays.asList() Doesn't Work with Primitive Arrays:

* When we pass a primitive array like int[] to Arrays.asList(), it treats the array as a single object instead of converting 
its elements into a list.
Solution:
* Use Arrays.stream(array) to convert the int[] array into a stream.
* Use .boxed() to convert the primitive int elements into their wrapper class Integer.
* Convert the stream into a list using .toList().	 */
		
		// Correct code of conversion of Arrays to ArrayList -> 
		
		// Convert int array to Integer list
        List<Integer> newarray = Arrays.stream(array).boxed().toList();
        // Check if the list contains the number 11
        System.out.println(newarray.contains(11)); // Output: true
	
	}

}
