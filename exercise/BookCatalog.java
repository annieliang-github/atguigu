package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class BookCatalog {
	
	ArrayList<Book> bookCatalog = new ArrayList<>();
	
	public void showBookCatalog() {
		System.out.println(Arrays.toString(bookCatalog.toArray())); 
	}
	
	public void addBook(Book book) {
		
		if (bookCatalog.contains(book)) {
			System.out.println("already exists");
			return;
		}
		bookCatalog.add(book);
		System.out.println("successfully added");
	}
	
	public Book searchBook(String bookSearch) {
		for (Book book : bookCatalog) {
			if (book.getAuthor().equalsIgnoreCase(bookSearch) ||
					book.getTitle().equalsIgnoreCase(bookSearch)) {
				return book;
			}
		}
		System.out.println("Didn't find it");
		return null;
	}
	

}
