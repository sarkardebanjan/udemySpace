package com.balazsholczer.generics;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * You can use an upper bounded wildcard to relax the restrictions on a variable.
 *  For example, say you want to write a method that works on List<Integer>, List<Double>, and 
 *  List<Number>; you can achieve this by using an upper bounded wildcard.
 *  
 *  To declare an upper-bounded wildcard, use the wildcard character ('?'), followed
 *   by the extends keyword, followed by its upper bound. Note that, in this context, 
 *   extends is used in a general sense to mean either "extends" (as in classes) 
 *   or "implements" (as in interfaces).
 *
 */


public class UpperWildcards {

	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
	
	public static void main(String[] args) {
		
		System.out.println( sumOfList(Arrays.asList(2,3,4,5.6)) );
		
	}
}
