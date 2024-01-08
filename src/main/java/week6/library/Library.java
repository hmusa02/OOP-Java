package week6.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : this.books) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}
