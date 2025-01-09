package Collection_frameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a hashtable pass table to set collection and print the key value 
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Madan");
		hm.put(1, "Kumar");
		hm.put(2, "Maurya");
		hm.put(3, "Papa ji");
		hm.put(4, "Aman");
		
		System.out.println(hm);
		System.out.println(hm.get(4));
		System.out.println(hm.remove(5));
		System.out.println(hm.get(5));
		
		// iteration in Hashmap
		
		Set st = hm.entrySet();  // Converting the HashMap to set
		Iterator it = st.iterator(); //creating the iterator since iterator works on sets
		
		while(it.hasNext()) {
			System.out.println(it.next()); // prints only key not value since it works for set which has one value here the
			// set is storing in key value pair form data
			
			/* A map entry (key-value pair). The Entry may be unmodifiable, or the value may be modifiable if the optional 
			   setValue method is implemented. The Entry may be independent of any map, or it may represent an entry of the 
			   entry-set view of a map.  */
			
			Map.Entry mp = (Map.Entry)it.next(); // Extracting the key,value from the set. 
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
