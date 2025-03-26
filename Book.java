// Book class representing a book entity
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;

    // Constructor to initialize book properties
    public Book(int bookId, String title, String author, String genre, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    // Getter methods to access book properties
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    // Setter method to update availability status
    public void setAvailabilityStatus(String status) {
        this.availabilityStatus = status;
    }

    public void updateBook(String title, String author, String genre, String status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = status;
    }

    // Override toString() for better display of book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", Availability: " + availabilityStatus;
    }
}
