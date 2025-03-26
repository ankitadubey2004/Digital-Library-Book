public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;

    public Book(int bookId, String title, String author, String genre, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

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

    public void setAvailabilityStatus(String status) {
        this.availabilityStatus = status;
    }

    public void updateBook(String title, String author, String genre, String status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = status;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", Availability: " + availabilityStatus;
    }
}
