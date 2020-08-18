package com.coursera;

import java.util.*;

public class BookCatalog {
	
	ArrayList<Book> bookList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	
	/**
	 * show what books are in book catalog
	 * @return 
	 */
	
	public String showBookList() {
		return Arrays.toString(bookList.toArray());
	}
	
	/**
	 * add a book to book catalog
	 * @param book
	 */
	
	public void addBook(Book book) {
		if (bookList.contains(book)) {
			System.out.println("The book " + book.getTitle() + " already exist.");
			return;
		}
		bookList.add(book);
		System.out.println("The book " + book.getTitle() + " has been successfully added.");
	}
	
	/**
	 * search the catalog and see if book name/author exist
	 * @param bookSearch a String of either author name or book title
	 */
	public Book searchBook(String bookSearch) {
		for (Book book : bookList) {
			if (book.getAuthor().equalsIgnoreCase(bookSearch) || book.getTitle().equalsIgnoreCase(bookSearch)) {
				System.out.println("Book " + bookSearch + " is found.");
				return book;
			}
		}
		System.out.println("Did not found book " + bookSearch + ".");
		return null;	
	}

	

}
