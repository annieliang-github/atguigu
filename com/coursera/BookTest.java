package com.coursera;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class BookTest {
	
	@Test
	public void test() throws FileNotFoundException {
		BookCatalog bookCatalog = new BookCatalog();
		BookFileReader bookFileReader = new BookFileReader();
		
		File file = new File("C:\\Users\\backc\\Desktop\\book1.txt");
		
		Book book = new Book();
		book.setContent(bookFileReader.readFile(file));
		book.setAuthor(bookFileReader.getBookAuthor(file));
		book.setTitle(bookFileReader.getBookTitle(file));
		
		System.out.println(book.getAuthor());
		String s2 = bookFileReader.getBookAuthor(file);
		String s1 = bookFileReader.getBookTitle(file);
		System.out.println(bookFileReader.getBookTitle(file));
		
		System.out.println("_______");
		
		System.out.println(Book.countWords(book.getContent()));
		
		bookCatalog.addBook(new Book(s1,s2));
		System.out.println(bookCatalog.showBookList());
				
		assertEquals(null,bookCatalog.searchBook("java"));
		assertEquals("[Book [title=Modern Short Stories, author=Various]]",bookCatalog.showBookList());
		
		String str = Book.getLines(file, 15);
		System.out.println(str);
		
	}

}
