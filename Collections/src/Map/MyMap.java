package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {

	/**
	 * An object that maps keys to values. A map cannot contain duplicate keys,
	 * 		 each key can map to at most one value
	 * 
	 * Some map implementations, like the TreeMap class, make specific guarantees as
	 * 	 to their order; others, like the HashMap class, do not
	 * 
	 * 		TreeMap: it is sorted 
	 * 		Hashtable: it is synchronized + it is slow !!!
	 * 		HashMap: does not synchronized
	 * 			Hashtable does not allow null keys or values.  HashMap allows one null key and
	 * 				 any number of null values
	 * 			
	 * Hasfunction -> ~ O(1)
	 * 
	 */
	
	public static void main(String[] args) {
	
		Map<Integer, Integer> myMap = new TreeMap<>();
		
		myMap.put(34, 27);
		myMap.put(1, 12);
		myMap.put(-5, 45);
		myMap.put(1000, 45);
		myMap.put(564, 45);
		myMap.put(3, 45);
		myMap.put(12, 45);
		
		for(Integer name : myMap.keySet() ){
			System.out.println(name+" - "+myMap.get(name));
		}
		
	}
}
