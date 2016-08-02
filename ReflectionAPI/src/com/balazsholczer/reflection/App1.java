package com.balazsholczer.reflection;

public class App1 {

	/**
	 * 
	 * What is reflection?
	 * 
	 * 		Reflection is a language's ability to inspect and dynamically call
	 * 		 	classes, methods, attributes
	 * 
	 * 		  getClass() -> we can get the class ... we do not know at compile time
	 * 
	 * Why to use reflection?
	 * 
	 * 		Reflection is important since it lets you write programs that 
	 * 		do not have to "know" everything at compile time, making them more dynamic,
	 * 				 since they can be tied together at runtime !!!
	 * 
	 * 		- lots of modern frameworks uses reflection extensively for this reason
	 * 		- one very common use case in Java is the usage with annotations
	 * 
	 *  		JUnit -> will use reflection to look through your classes for methods
	 *  			 tagged with the @Test annotation
	 *  				-> will then call them when running the unit test !!!
	 * 
	 */
	
}
