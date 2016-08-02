package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	/**
	 *	We insert the items at the end of the queue and items are removed from
	 *		the beginning of the queue
	 *
	 *			FIFO structure -> First In First Out !!!
	 *
	 *			we insert items here   ->	| QUEUE |  ->  we get the items here
	 *
	 *		java.util.LinkedList
	 *		java.util.PriorityQueue -> PriorityQueue stores its elements internally according 
	 *				to their natural order (if they implement Comparable)
	 *
	 *		add() -> we add items to our queue
	 *
	 *		element() -> approximately the same as peek(): we get the first item without
	 *			removing it !!!
	 *
	 *		remove() -> this method removes the element at the head of the queue
	 *
	 *		Applications: breadth-first search !!!		
	 */
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(34);
		queue.add(0);
		
		System.out.println(queue.element());
		
		for(Integer s : queue){
			System.out.print(s+" ");
		}
		
		queue.remove(0);
		System.out.println();
		
		for(Integer s : queue){
			System.out.print(s+" ");
		}
		
		
		
	}
}
