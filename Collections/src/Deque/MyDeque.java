package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {

	/**
	 * Double ended queue !!!
	 * 
	 * 	It represents a queue where you can insert and remove elements from both ends of the queue
	 * 
	 * 	java.util.ArrayDeque	
	 * 	java.util.LinkedList
	 * 
	 *  ArrayDeque stores its elements internally in an array 
	 *  	If the number of elements exceeds the space in the array,
	 *  		 a new array is allocated, and all elements moved over
	 *  
	 *      In other words, the ArrayDeque grows as needed, even if it stores its elements in an array
	 *
	 *			addFirst() add element at head
	 *			addLast() add element at tail
	 *
	 *			getFirst()	get element from head
	 *			getLast() get element from tail
	 */
	
	public static void main(String[] args) {
		
		Deque<Integer> myDeque = new LinkedList<>();
		
		myDeque.addFirst(3);
		myDeque.addFirst(4);
		
		myDeque.addLast(5);
		myDeque.addLast(6);
		
		System.out.println(myDeque.getLast());
		
	}
}
