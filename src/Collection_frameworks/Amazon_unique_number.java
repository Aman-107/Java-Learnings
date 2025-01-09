package Collection_frameworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Amazon_unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5,5,5,4,6,6,9,4,9,8};
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		for(int i=0; i<a.length; i++) {
//			int k =0;
//			if (!al.contains(a[i])) {
//				al.add(a[i]);
//				k++;
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] == a[j]) {
//					k++;
//				}
//			}
//			System.out.println("Number " + a[i] + " repeated " + k + " times");
//			if(k == 1)
//			System.out.println("Unique Number is " + a[i]);
//			}
//		}
		
		
HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
{
		for(int i=0; i<a.length; i++) {
			int k =1;
			if (hm.containsKey(a[i])) {
				hm.put(a[i], 0);
				k++;
				}
			hm.put(a[i], k);
		}
		
		Set st = hm.entrySet();
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			if(me.getValue().equals(1)) {
				System.out.println(me.getKey());
			}
			
		}
}


	}	
}



/* Same Question using chatGpt using concept of HashMap.
 
 import java.util.HashMap;

public class UniqueNumberFrequency {
    public static void main(String[] args) {
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};
        
        // Using a HashMap to store numbers and their frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array to calculate frequencies
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Print numbers with frequency as 1
        System.out.println("Numbers with frequency 1:");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}


Using Sets with Adding and deleting numbers : 

import java.util.HashSet;
import java.util.Set;

public class UniqueNumberUsingSet {
    public static void main(String[] args) {
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        // Sets to store unique and duplicate numbers
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        // Iterate through the array
        for (int num : a) {
            if (!uniqueSet.add(num)) {
                // If adding to uniqueSet fails, it means it's a duplicate
                duplicateSet.add(num);
            }
        }

        // Remove duplicates from the unique set
        uniqueSet.removeAll(duplicateSet);

        // Print unique numbers (frequency 1)
        System.out.println("Unique number(s) with frequency 1:");
        for (int num : uniqueSet) {
            System.out.println(num);
        }
    }
}

 
*/