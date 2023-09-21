package by.bsuir.lab1.task16.comparator;

import by.bsuir.lab1.task12.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleAuthorComparatorTest {
    private static final ArrayList<Book> books = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        books.add(new Book("Book A", "Author B", 30));
        books.add(new Book("Book A", "Author A", 20));
        books.add(new Book("Book A", "Author C", 10));
        books.add(new Book("Book B", "Author A", 15));
    }

    @Test
    void testCompare() {
        books.sort(new TitleAuthorComparator());
        assertEquals("Author A", books.get(0).getAuthor());
        assertEquals("Author B", books.get(1).getAuthor());
        assertEquals("Author C", books.get(2).getAuthor());
        assertEquals("Book B", books.get(3).getTitle());
    }
}
