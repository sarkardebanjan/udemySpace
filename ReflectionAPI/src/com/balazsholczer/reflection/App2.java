package com.balazsholczer.reflection;

	/**
	 * 
	 * Class person = Class.forName("com.balazsholczer.reflection.Person");
	 * Class class = this.getClass();
	 *
	 */

class Bus extends Vehicle {
	
}

class Vehicle {
	
}

public class App2 {
	
	public static void whoAmI(Object o){
		System.out.println("My name is: "+o.getClass().getName()+"\nMy parent is: "+o.getClass().getSuperclass().getName());
	}
	
	public static void main(String[] args) {
		
		whoAmI(new Bus());
		
	}
}
