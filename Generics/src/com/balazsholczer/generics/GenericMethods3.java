package com.balazsholczer.generics;

public class GenericMethods3 {

			// this is the bounded type parameters
	public static <T> void printData(T data){
		System.out.println(data.toString());
	}
	
	public static void main(String[] args) {

		printData(4.5);

	}
}
