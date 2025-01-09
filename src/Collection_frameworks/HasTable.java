package Collection_frameworks;


import java.util.Hashtable;

public class HasTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(0, "Madan");
		hm.put(1, "Kumar");
		hm.put(2, "Maurya");
		hm.put(3, "Papa ji");
		hm.put(4, "Aman");
		
		System.out.println(hm.contains("Aman"));
	}

}


/* NOTES : Difference between HashMap and HashTable
 
 1. Synchronization or Thread Safe :
 ->	HashMap:
 * Not thread-safe: It is not synchronized, which means multiple threads can access and modify it simultaneously, 
   leading to potential data inconsistency.
 * Suitable for single-threaded environments or when external synchronization is applied using Collections.synchronizedMap() 
   or ConcurrentHashMap.
 
 -> Hashtable:
* Thread-safe: It is synchronized, meaning only one thread can access or modify it at a time.
* Slower performance due to synchronization overhead.
* Suitable for legacy multi-threaded applications.


2. Null Keys and Values
 -> HashMap:
* Allows one null key and multiple null values. 
 
 ->Hashtable:
* Does not allow null keys or values.

 
3. iteating the values : 
-> HashMap :
* Hashmap object values are iterated by using iterator. 
 
-> Hashtable :
* HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
 */

