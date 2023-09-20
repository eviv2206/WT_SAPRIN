package by.bsuir.lab1.task14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private static Book book;

    @BeforeAll
    static void beforeAll() {
        book = new Book("Title", "Author", 100);
    }
    
    @Test
    void testClone() {
        Book book1 = (Book) book.clone();
        assertEquals(book, book1);
    }
    
    
}
