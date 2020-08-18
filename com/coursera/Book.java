package com.coursera;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Book {
	private String title;
	private String author;
	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
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
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	/**
	 * counting the total words
	 * @param content of book or sentence in String
	 * @return how many words in total
	 */
	
	public static int countWords(String string) {
		int wordCount = string.split("\\s+").length;
		return wordCount;
	}
	
	/**
	 * counting the unique words
	 * @param string
	 * @return how many unique words in sentence case-insensitive
	 */
	
	public static int countUnique(String string) {
		Set<String> wordsOfText = new HashSet<>();
		String[] str = string.split("\\s+");
		
		for (String word : str) {
			wordsOfText.add(word.toLowerCase().replaceAll("[^a-z]", ""));
		}
		return wordsOfText.size();
	}
	
	/**
	 * output the content of a file till the Nth line 
	 * @param file
	 * @param n indicating the Nth line
	 * @throws FileNotFoundException if no file found
	 */
	public static String getLines(File file, int n) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		StringBuilder stringBuilder = new StringBuilder();
		try {
			for (int i = 0; i < n; i++) {
				stringBuilder.append(scanner.nextLine() + "\n");
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		scanner.close();
		return stringBuilder.toString();
	}
	

}
