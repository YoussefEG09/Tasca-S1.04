package Level1_Tasca_S1_04;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LibraryTest {


    private Library library;

    @BeforeEach
    public void setUp(){
        library = new Library();
    }

    @Test
    public void testListIsNotNull(){
        assertNotNull(library.getBooksList(), "Library can not be null.");
    }


    @Test
    public void testNoDuplicateTitles(){
        Book book1 = new Book("Don Quijote");
        Book book2 = new Book("don quijote");

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(1, library.getBooksList().size() , "It can not be repeated books");
    }


    @org.junit.jupiter.api.Test
    void getBooksList() {
        assertEquals(0, library.getBooksList().size());

    }

    @org.junit.jupiter.api.Test
    void addBook() {
        Book book1 = new Book("Don Quijote");
        library.addBook(book1);

        assertEquals(1, library.getBooksList().size());
        assertEquals("Don Quijote", library.getBooksList().get(0).getName() );

    }

    @org.junit.jupiter.api.Test
    void deleteBook() {
        Book book1 = new Book("Don Quijote");
        library.addBook(book1);

        library.deleteBook(book1);

        assertEquals(0, library.getBooksList().size());
    }


    @org.junit.jupiter.api.Test
    void getBookAtPosition() {
        Book book1 = new Book("Don Quijote");
        Book book2 = new Book("Harry Potter");
        library.addBook(book1);
        library.addBook(book2);

        assertEquals("Don Quijote", library.getBookAtPosition(0).getName());
        assertEquals("Harry Potter", library.getBookAtPosition(1).getName());
    }

    @org.junit.jupiter.api.Test
    void sortBooks() {
        Book book1 = new Book("Don Quijote");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book("Moby Dick");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.sortBooks();

        assertEquals("Don Quijote", library.getBooksList().get(0).getName());
        assertEquals("Harry Potter", library.getBooksList().get(1).getName());
        assertEquals("Moby Dick", library.getBooksList().get(2).getName());
    }

    @org.junit.jupiter.api.Test
    void deleteBookForTitle() {
        Book book1 = new Book("Don Quijote");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book("Moby Dick");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.deleteBookForTitle("Harry Potter");

        assertEquals(2, library.getBooksList().size());
        assertEquals("Don Quijote", library.getBooksList().get(0).getName());
        assertEquals("Moby Dick", library.getBooksList().get(1).getName());

    }

    @org.junit.jupiter.api.Test
    void addBookAtPosition() {
        Book book1 = new Book("Don Quijote");
        Book book2 = new Book("Harry Potter");
        Book book3 = new Book("Moby Dick");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Book book4 = new Book("Aladdin");
        library.addBookAtPosition(2, book4);

        assertEquals(4, library.getBooksList().size());
        assertEquals("Aladdin", library.getBooksList().get(0).getName());
        assertEquals("Don Quijote", library.getBooksList().get(1).getName());
        assertEquals("Harry Potter", library.getBooksList().get(2).getName());
        assertEquals("Moby Dick", library.getBooksList().get(3).getName());


    }
}