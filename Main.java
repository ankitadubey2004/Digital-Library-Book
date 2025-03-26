import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability Status (Available/Checked Out): ");
                    String status = scanner.nextLine();
                    library.addBook(bookId, title, author, genre, status);
                    break;

                case 2:
                    // Display all books
                    library.viewAllBooks();
                    break;

                case 3:
                    // Search for a book by ID
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = scanner.nextInt();
                    Book foundBook = library.searchBook(searchId);
                    System.out.println((foundBook != null) ? foundBook : "Book not found.");
                    break;

                case 4:
                    // Update book details
                    System.out.print("Enter Book ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter New Genre: ");
                    String newGenre = scanner.nextLine();
                    System.out.print("Enter New Availability Status: ");
                    String newStatus = scanner.nextLine();
                    library.updateBook(updateId, newTitle, newAuthor, newGenre, newStatus);
                    break;

                case 5:
                    // Delete a book
                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    library.deleteBook(deleteId);
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Please enter a number between 1-6.");
            }
        }
    }
}
