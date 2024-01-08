package week6.library;

import java.util.ArrayList;

public class MainLibrary {
    public static void main(String[] args) {

        // Instance:
        Library library = new Library();

        // Add books to the library:
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        library.addBook(nhl);

        Book stinkyCheese = new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992);
        library.addBook(stinkyCheese);

        Book battleAxes = new Book("Battle Axes", "Tom A. Hawk", 1851);
        library.addBook(battleAxes);

        // Print all books in the library:
        System.out.println("All books in the library:");
        library.printBooks();
        System.out.println();

        // Search for books by title:
        System.out.println("Search for books by title containing 'Cheese':");
        ArrayList<Book> titleSearchResult = library.searchByTitle("Cheese");
        printBooks(titleSearchResult);
        System.out.println();

        // Search for books by publisher:
        System.out.println("Search for books by publisher containing 'Penguin':");
        ArrayList<Book> publisherSearchResult = library.searchByPublisher("Penguin");
        printBooks(publisherSearchResult);
        System.out.println();

        // Search for books by year:
        System.out.println("Search for books published in the year 1851:");
        ArrayList<Book> yearSearchResult = library.searchByYear(1851);
        printBooks(yearSearchResult);
    }

    // Helper method to print books:
    private static void printBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
        System.out.println();
    }
}
