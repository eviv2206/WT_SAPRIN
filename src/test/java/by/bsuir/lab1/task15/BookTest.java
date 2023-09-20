package by.bsuir.lab1.task15;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {
    private static Book book;
    private static Book book1;
    private static Book book2;


    @BeforeAll
    static void beforeAll() {
        book1 = new Book("Book A", "Author X", 20, "ISBN-12345");
        book2 = new Book("Book B", "Author Y", 15, "ISBN-56789");
        book = book1;
    }

    @Test
    void testCompareTo() {
        assertTrue(book2.compareTo(book1) > 0);
        assertEquals(0, book1.compareTo(book));
        assertTrue(book1.compareTo(book2) < 0);
    }
}
