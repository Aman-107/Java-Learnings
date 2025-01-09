package Collection_frameworks;

import java.util.ArrayList;

public class Collection_intro_defination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        // Udemy Question
	        ArrayList<String> a = new ArrayList<String>();
	        a.add("apple");
	        a.add("banana");
	        a.add("cherry");
	        a.add("mango");
	        a.add("apple");
	        
	        System.out.println(a);
	        
	        a.remove(0);
	        System.out.println(a);
	        System.out.println(a.contains("orange"));
	        System.out.println(a.size());
	        
	        for(String Item : a){
	            System.out.println(a.indexOf(Item) + " " + Item);
	        }
	        
	    }
		
		
	}

/*  Refer Notes as well
-> Java Collections Framework is a collection of interfaces and classes which helps in storing and processing data efficiently.
-> This framework has several useful classes which have tons of useful functions which makes programmer task super easy.

-> Collection (3 main's )::

-> List
* A list is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements.
* Below are classes implement list interface
  ArrayList
  LinkedList
  Vector
  
-> Set
* A Set is a collection that cannot contain duplicate elements.
* However, it makes no guarantees concerning the order of iteration.
* Below are classes implement Set interface
  HashSet
  LinkedHashSet
  TreeSet
  
-> Map
* A Map is an object that maps keys to values. A map cannot duplicate keys.
* Below are main implementations of Map interfaces.
  HashMap
  TreeMap
  LinkedHashMap
 
 */
