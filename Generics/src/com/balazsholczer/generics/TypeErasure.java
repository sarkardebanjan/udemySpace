package com.balazsholczer.generics;

class Store4<T>{
	
	// unboundes types so it will be replaced with Object
	private T item;
	
	public void setItem(T item){
		this.item = item;
	}
}

class Store5<T extends Comparable<T>>{
	
	// bounded types so it will be replaced with the bounded type
	private T item;
	
	public void setItem(T item){
		this.item = item;
	}
}

public class TypeErasure {

	/**
	 * Generics -> provide tighter type checks at compile time
	 * 	In order to implement generics, Java uses type erasure to:
	 * 		- replace all type parameters in generic types with their bounds or Object 
	 * 			if the type parameters are unbounded
	 * 				So the final bytecode will contain plain java objects/classes
	 * 		- uses type casts if necessary
	 * 		- sometimes it generates extra methods: the so called bridge methods
	 * 				in order to maintain polymorphism with generics tpyes
	 * 
	 * 
	 */

	
	
}
