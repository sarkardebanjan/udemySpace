package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Friedrich Nietzsche",560));
		books.add(new Book("Albert Camus",370));
		books.add(new Book("Jean Paul Sartre",890));
		books.add(new Book("Borges",230));
		
		System.out.println(books);
		Collections.sort(books);
		System.out.println(books);
		
		
	}
}
