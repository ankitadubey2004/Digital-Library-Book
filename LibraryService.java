import java.util.ArrayList;
import java.util.Scanner;

public class LibraryService {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(int bookId, String title, String author, String genre, String status) {
        books.add(new Book(bookId, title, author, genre, status));
        System.out.println("Book added successfully!");
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

}
