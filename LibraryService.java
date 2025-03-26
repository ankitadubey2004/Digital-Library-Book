import java.util.ArrayList;
import java.util.Scanner;

// LibraryService class to manage book
public class LibraryService {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a new book to the catalog
    public void addBook(int bookId, String title, String author, String genre, String status) {
        books.add(new Book(bookId, title, author, genre, status));
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Search for a book by its unique ID
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        // Returns null if book is not found
        return null;
    }

    // Update book details (title, author, genre, availability status)
    public void updateBook(int bookId, String title, String author, String genre, String status) {
        Book book = searchBook(bookId);
        if (book != null) {
            book.updateBook(title, author, genre, status);
            System.out.println("Book details updated successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Remove a book from the catalog by ID
    public void deleteBook(int bookId) {
        Book book = searchBook(bookId);
        if (book != null) {
            books.remove(book);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }
}
