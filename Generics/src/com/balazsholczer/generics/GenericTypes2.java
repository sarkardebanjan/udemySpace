package com.balazsholczer.generics;

//class Store {
//	
//	private Object item;
//	
//	public Object getItem(){
//		return this.item;
//	}
//	
//	public void setItem(Object item){
//		this.item = item;
//	}
//}

// these Ts are the  type parameters
class Store<T> {

	private T item;

	public T getItem() {
		return this.item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}

class Hashtable<K,V> {
	
	K key;
	V value;
	
	public Hashtable(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return key.toString()+"-"+value.toString();
	}
}

public class GenericTypes2 {

	public static void main(String[] args) {

		// instead of passing an argument to a method, you are passing a type argument
		Store<String> store = new Store<>();
		store.setItem("BAlazs");
		
		// raw types: we should avoid it
		Store store2 = new Store();

		Hashtable<String, Integer> hastable = new Hashtable<String, Integer>("apple", 50);
		
		System.out.println(hastable);

	}
}
