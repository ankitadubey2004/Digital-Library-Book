import java.util.ArrayList;
import java.util.Scanner;

public class LibraryService {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(int bookId, String title, String author, String genre, String status) {
        books.add(new Book(bookId, title, author, genre, status));
        System.out.println("Book added successfully!");
    }
}
