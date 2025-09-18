package Level1_Tasca_S1_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> bookList;


    public Library() {
        bookList = new ArrayList<>();
    }

    public List<Book> getBooksList() {
        return bookList;
    }

    public void addBook(Book book) {
        for (Book b : bookList) {
            if (b.getName().equalsIgnoreCase(book.getName())) {
                System.out.println("Book is already in the library.");
                return;
            }
        }
        bookList.add(book);
        sortBooks();
    }

    public void deleteBook(Book book) {
        bookList.remove(book);
    }

    public void showBookList() {
        System.out.println(bookList);
    }

    public Book getBookAtPosition(int position) {
        if (position < 0 || position >= bookList.size()) {
            throw new IndexOutOfBoundsException(" Invalid position ");
        }
        return bookList.get(position);
    }

    public void sortBooks() {
        bookList.sort(Comparator.comparing(Book::getName, String.CASE_INSENSITIVE_ORDER));
    }

    public void deleteBookForTitle(String title) {
        boolean removed = bookList.removeIf(book -> book.getName().equalsIgnoreCase(title));

        if (removed) {
            System.out.println(title + " was removed correctly.");
            sortBooks();
        } else {
            System.out.println(title + " nor found in the library.");
        }

    }

    public void addBookAtPosition(int position, Book book) {
        if (position < 0 || position >= bookList.size()) {
            throw new IndexOutOfBoundsException(" Invalid position ");
        }
        for (Book b : bookList) {
            if (b.getName().equalsIgnoreCase(book.getName())) {
                System.out.println("Book is already in the library.");
                return;
            }

        }
        bookList.add(position, book);
        sortBooks();
    }


}
