package exercise;

import java.io.File;
import org.junit.Test;



class BookTest {
	
	BookCatalog bookCatalog = new BookCatalog();
	BookFileReader bookFileReader = new BookFileReader();
	
	String path = "/Users/annie/Desktop/book2.txt";
	File file = new File(path);
	
	Book book = new Book();
	
	String author = book.getBookAuthor(file);
	String title = book.getBookTitle(file);
	String content = bookFileReader.readFile(file);


	@Test
	void test() {
		
		book.setAuthor(author);
		book.setTitle(title);
		
		int unique = Book.countUnique(content);
		int words = Book.countWords(content);
		System.out.println(unique);
		System.out.println(words);
		
		bookCatalog.addBook(book);
		bookCatalog.showBookCatalog();
	
		bookCatalog.searchBook("Tom");
	}
	

}
