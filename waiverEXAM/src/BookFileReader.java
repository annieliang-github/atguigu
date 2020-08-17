import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BookFileReader {

    public void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getFileTitle(File file) {
        String title = "";
        try {
            Scanner scanner = new Scanner(file);
            String word = scanner.next();
            if (word.equalsIgnoreCase("title")) {
                title = scanner.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return title;
    }

    public String getFileAuthor(File file) {
        String author = "";
        try {
            Scanner scanner = new Scanner(file);
            String word = scanner.next();
            if (word.equalsIgnoreCase("author")) {
                author = scanner.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return author;
    }

}