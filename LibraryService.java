import java.util.HashMap;
import java.util.Map;

// LibraryService class to manage books using HashMap
public class LibraryService {
    private Map<Integer, Book> books = new HashMap<>();

    // Add a new book to the catalog
    public void addBook(int bookId, String title, String author, String genre, String status) {
        if (books.containsKey(bookId)) {
            System.out.println("Book ID already exists. Choose a unique ID.");
            return;
        }
        books.put(bookId, new Book(bookId, title, author, genre, status));
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    // Search for a book by its unique ID
    public Book searchBook(int bookId) {
        return books.getOrDefault(bookId, null);
    }

    // Update book details (title, author, genre, availability status)
    public void updateBook(int bookId, String title, String author, String genre, String status) {
        if (books.containsKey(bookId)) {
            books.get(bookId).updateBook(title, author, genre, status);
            System.out.println("Book details updated successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Remove a book from the catalog by ID
    public void deleteBook(int bookId) {
        if (books.remove(bookId) != null) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }
}
