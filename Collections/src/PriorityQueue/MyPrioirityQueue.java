package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPrioirityQueue {

	/**
	 * 	 Based on a priority heap !!!!!!
	 * 
	 * add() -> add elements to the queue
	 * 
	 * peek() -> Retrieves, but does not remove, the head of this queue, 
	 * 				or returns null if this queue is empty.
	 * 
	 * poll() -> Retrieves and removes the head of this queue, or returns null if this queue is empty
	 * 
	 */
	
	public static void main(String[] args) {
		
		Queue<Person> myQueue = new PriorityQueue<>();
		
		myQueue.add(new Person("Adam",26));
		myQueue.add(new Person("Joe",45));
		myQueue.add(new Person("Sarah",12));
		myQueue.add(new Person("Michael",83));
		
		while( myQueue.peek() != null ){
			System.out.print( myQueue.poll()+" " );
		}
		
	}
}
