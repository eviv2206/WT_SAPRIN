package by.bsuir.lab1.task16.comparator;

import by.bsuir.lab1.task12.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleComparatorTest {
    private static final ArrayList<Book> books = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        books.add(new Book("B", "Author1", 10));
        books.add(new Book("A", "Author2", 15));
        books.add(new Book("C", "Author3", 20));
    }

    @Test
    void testCompare() {
        books.sort(new TitleComparator());
        assertEquals("A", books.get(0).getTitle());
        assertEquals("B", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }
}
