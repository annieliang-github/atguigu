package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Book {

	private String title;
	private String author;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookCatalog [title=" + title + ", author=" + author + "]";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
	}
	
	public String getBookTitle(File file) {
		String title = "";
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String word = scanner.nextLine();
				if (word.contains("Title: ")) {
					title = word.substring("Title: ".length());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		scanner.close();
		return title;
	}
	
	public String getBookAuthor(File file) {
		String author = "";
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String word = scanner.nextLine();
				if (word.contains("Author: ")) {
					author = word.substring("Author: ".length());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		scanner.close();
		return author;
	}
	
	public static int countWords(String content) {
		int wordCount = content.split("\\s+").length;
		return wordCount;	
	}
	
	public static int countUnique(String content) {
		Set<String> words = new HashSet<>();
		String[] strings = content.split("\\s+");
		
		for (String wordString : strings) {
			words.add(wordString.toLowerCase().replaceAll("[^a-z']", ""));
		}

		return words.size();
	}
	
	public static String getLines(File file, int n) throws FileNotFoundException {
		StringBuilder stringBuilder = new StringBuilder();
		Scanner scanner = new Scanner(file);
		
		try {
			for (int i = 0; i < n; i++) {
				stringBuilder.append(scanner.nextLine() + "\n");
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		scanner.close();
		return stringBuilder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
