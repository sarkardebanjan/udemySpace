package com.balazsholczer.generics;

import java.util.List;

	/**
	 * 
	 * Upper bounded wildcard -> restricts the unknown type to be a specific type or a SUBTYPE of that type
	 * 		We use the extends keyword 
	 * 
	 * Lower bounded wildcard -> restricts the unknown type to be a specific type or a SUPER type of that type
	 * 		We use the super keyword
	 * 
	 * 	Example: we would like to add integers to a list. In order to maximize flexibility we would like our
	 * 		method to work on Numbers or Objects as well
	 * 			So anything that can hold an integer value...
	 * 
	 * 
	 * 	public void addNumber(List<? super Integer> list){
	 * 		for(int i=0;i<10;i++){
	 * 			list.add(i);
	 * 		}
	 *  }
	 *
	 */

public class LowerWildcards {
	
}
