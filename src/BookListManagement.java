
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookListManagement {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        initializeBooks();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Print all books");
            System.out.println("2. Sort books by title");
            System.out.println("3. Sort books by author");
            System.out.println("4. Sort books by ISBN");
            System.out.println("5. Sort books by publisher");
            System.out.println("6. Sort books by release year");
            System.out.println("7. Display a book by index");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    printAllBooks();
                    break;
                case 2:
                    sortBooksByTitle();
                    break;
                case 3:
                    sortBooksByAuthor();
                    break;
                case 4:
                    sortBooksByISBN();
                    break;
                case 5:
                    sortBooksByPublisher();
                    break;
                case 6:
                    sortBooksByReleaseYear();
                    break;
                case 7:
                    displayBookByIndex(sc);
                    break;
                case 8:
                    sc.close();
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please choose a number between 1 and 8.");
            }
        }
    }

    // Method to initialize some sample books
    private static void initializeBooks() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Scribner", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "Harper Perennial Modern Classics",
                1960));
        books.add(new Book("1984", "George Orwell", "9780451524935", "Signet Classic", 1949));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", "Little, Brown and Company",
                1951));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "9780141439518", "Penguin Classics", 1813));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227", "Mariner Books", 1937));
        books.add(new Book("To the Lighthouse", "Virginia Woolf", "9780156907392", "Harcourt, Inc.", 1927));
        books.add(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", "9780060883287",
                "Harper Perennial Modern Classics", 1967));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780618640157", "Houghton Mifflin Harcourt",
                1954));
        books.add(new Book("Moby-Dick", "Herman Melville", "9780142437247", "Penguin Classics", 1851));
    }

    // Method to print all books
    private static void printAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Index " + i + ": " + books.get(i));
        }
    }

    // Method to sort books by title
    private static void sortBooksByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        System.out.println("Books sorted by title:");
        printAllBooks();
    }

    // Method to sort books by author
    private static void sortBooksByAuthor() {
        Collections.sort(books, Comparator.comparing(Book::getAuthor));
        System.out.println("Books sorted by author:");
        printAllBooks();
    }

    // Method to sort books by ISBN
    private static void sortBooksByISBN() {
        Collections.sort(books, Comparator.comparing(Book::getISBN));
        System.out.println("Books sorted by ISBN:");
        printAllBooks();
    }

    // Method to sort books by publisher
    private static void sortBooksByPublisher() {
        Collections.sort(books, Comparator.comparing(Book::getPublisher));
        System.out.println("Books sorted by publisher:");
        printAllBooks();
    }

    // Method to sort books by release year
    private static void sortBooksByReleaseYear() {
        Collections.sort(books, Comparator.comparingInt(Book::getReleaseYear));
        System.out.println("Books sorted by release year:");
        printAllBooks();
    }

    // Method to display a book by index
    private static void displayBookByIndex(Scanner sc) {
        System.out.print("Enter the index of the book you want to display: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (index >= 0 && index < books.size()) {
            System.out.println("Book at index " + index + ": " + books.get(index));
        } else {
            System.out.println("Invalid index!");
        }
    }
}
