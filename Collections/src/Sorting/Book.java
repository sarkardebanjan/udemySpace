package Sorting;

public class Book implements Comparable<Book>{

	private String author;
	private int numOfPages;

	public Book(String author, int numOfPages) {
		this.author = author;
		this.numOfPages = numOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		return this.author;
	}

	@Override
	public int compareTo(Book otherBook) {
		return -Integer.compare(this.author.length(), otherBook.getAuthor().length());
	}
}
