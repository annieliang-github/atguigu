package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BookFileReader {
		
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
	
}
