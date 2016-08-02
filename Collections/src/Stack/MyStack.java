package Stack;

import java.util.Collections;
import java.util.Stack;

public class MyStack {

	/**
	 * 	A Stack is a data structure where you add elements to the "top" of the stack,
	 * 		 and also remove elements from the top again
	 * 
	 * 			Last In First Out (LIFO) principle
	 * 
	 * 				- Stack's are really good for some types of data processing	
	 * 					For instance if you are parsing an XML file using either SAX or StAX
	 * 
	 * 		push() method pushes an object onto the top of the Stack
	 * 
	 * 		peek() method returns the object at the top of the Stack, but does not
	 * 					remove object
	 * 
	 * 		pop() method returns the object at the top of the stack,
	 * 				 and removes the object from the Stack
	 * 
	 */
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(100);
		stack.push(-2);
		stack.push(1);
		
//		for(Integer num : stack){
//			System.out.print(num+" ");
//		}
		
		Collections.sort(stack);
		
		System.out.println( stack );
		
	}
}
