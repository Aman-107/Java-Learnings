package Collection_frameworks;

import java.util.HashSet;

public class hasSet_1 {
/*-> HasSet, TreeSet, LinkedHashSet implements Set interface
 -> does not accept duplicate values
 -> There is no guarantee elements stored in sequential order. Random order unlike ArrayList hence we can't perform any operation
    at/for indexes.	
	
	
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");  // inserting duplicates but it doesn't accept it
		System.out.println(hs);
		System.out.println(hs.remove("USA"));
		System.out.println(hs.contains("INDIA"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
	
	}

}
