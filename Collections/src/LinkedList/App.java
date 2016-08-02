package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {

	/**
	 * 
	 * 	It uses references -> each item has a reference to the next item + store the 
	 * 			data itself
	 * 
	 * 			34  ->  100  ->  -12  ->  1
	 * 
	 * 		- we can remove items very efficiently / O(1)
	 * 		- no sequential access !!! if we want to find an item we have to iterate through
	 * 			the list until we find it / O(N)
	 * 		- remove operation is very efficient: just update the references/pointers O(1)
	 * 
	 * 		- so we should use a linkedList for remove-heavy applications !!!
	 */
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("Adam");
		list.add("Kevin");
		list.add("Sarah");
		list.add("Michael");
		
		Collections.sort(list);
		System.out.println(list.get(2));
		
		for(String name : list){
			System.out.print(name+" ");
		}
	}
}
