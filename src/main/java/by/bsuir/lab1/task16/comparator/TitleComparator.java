package by.bsuir.lab1.task16.comparator;

import by.bsuir.lab1.task12.Book;
import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
