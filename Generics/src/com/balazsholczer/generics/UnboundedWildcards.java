package com.balazsholczer.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {

	/**
	 * We have the ? only !!!
	 * There are two scenarios where an unbounded wildcard is a useful approach:
	 * 	- If you are writing a method that can be implemented using functionality provided in the Object class
	 * 		For example: wait(), notify() equals()
	 * 
	 * 	- When the code is using methods in the generic class that don't depend on the type parameter
	 * 		For example: List.size()   List.clear()  !!!!
	 * 
	 * 
	 * 	List<Object>  can not pint List<Integer> or List<Double>  
	 * 			because they are not subtypes of List<Object>.  !!!
	 * 
	 * 	IMPORTANT: Integer is an Oject but List<Integer> is not a List<Object> !!!
	 */
	
	public static void printList(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	public static void main(String[] args) {
		
		printList(Arrays.asList(1,2,3));
		
	}
}
