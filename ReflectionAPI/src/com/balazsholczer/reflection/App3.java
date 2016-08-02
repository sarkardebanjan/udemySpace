package com.balazsholczer.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
	
	private int age;
	private String name;
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void showInfo(){
		System.out.println(this.name+" - "+this.age);
	}
}

public class App3 {
	
	public static void main(String[] args) {	
		
		Person person = new Person(34, "John");
		
		try{
		
			Class personClass = person.getClass();
			
			Field ageField = personClass.getDeclaredField("age");
			ageField.setAccessible(true);
			Object ageValue = ageField.get(person);
			System.out.println(ageValue);
			
			Field nameField = personClass.getDeclaredField("name");
			nameField.setAccessible(true);
			Object nameValue = nameField.get(person);
			System.out.println(nameValue);
			
			Method showInfoMethod = personClass.getMethod("showInfo", null);
			showInfoMethod.invoke(person, null);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
