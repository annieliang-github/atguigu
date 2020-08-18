package com.coursera;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookFileReader {
	
	/**
	 * reading the content of a given book 
	 * @param file
	 * @return text of this file in String
	 */
	
	public String readFile(File file) {
		String content = "";
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				content = content + scanner.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		scanner.close();
		return content;
	}
	
	/**
	 * @param file 
	 * @return title of the book
	 */
	
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
	
	/**
	 * @param file
	 * @return author of the book
	 */
	
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
	
	
}
