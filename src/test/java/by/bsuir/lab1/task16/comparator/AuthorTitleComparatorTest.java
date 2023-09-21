package by.bsuir.lab1.task16.comparator;

import by.bsuir.lab1.task12.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTitleComparatorTest {

    private static final ArrayList<Book> books = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        books.add(new Book("Book A", "Author A", 30));
        books.add(new Book("Book B", "Author A", 20));
        books.add(new Book("Book C", "Author C", 15));
        books.add(new Book("Book A", "Author D", 10));
    }

    @Test
    void testCompare() {
        books.sort(new AuthorTitleComparator());
        assertEquals("Author A", books.get(0).getAuthor());
        assertEquals("Book A", books.get(0).getTitle());
        assertEquals("Author A", books.get(1).getAuthor());
        assertEquals("Book B", books.get(1).getTitle());
        assertEquals("Author C", books.get(2).getAuthor());
        assertEquals("Author D", books.get(3).getAuthor());
    }
}
