package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
	
	/*
	 * An array stores the values in the background !!!
	 * 
	 * 	- sequential access / very fast O(1)
	 *  - but if we want to remove items, this operation is not so efficient
	 *  		We have to shift each item in our list - O(N)
	 *  
	 *  If our application is just about adding elements to a list and
	 *  	getting elements with known indexes -> an arrayList is perfect
	 * 
	 */

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(-4);
		list.add(5);
		list.add(1);
		
		Collections.shuffle(list);
		
		for(Integer num : list){
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		System.out.println( list.get(2) );
		
		
	}
}
