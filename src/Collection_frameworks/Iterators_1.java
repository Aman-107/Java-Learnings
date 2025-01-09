package Collection_frameworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Iterators_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("Pronouns");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		
	//	Iterator<String> i = hs.iterator(); // jis type ka create hua vahi arg pass hoga
		Iterator i = hs.iterator(); // manually Iterator has to be created for HashSet -> if this not working then add arguments
		while(i.hasNext()) { // executes until it finds the next element is present
			System.out.println(i.next()); // to print the next value hypothetically i.next() is at -1 index
		}
		
		ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println(a);
        
        for(String Item : a){   // Iteration for ArrayList
            System.out.println(a.indexOf(Item) + " " + Item);
        }
	}

}
