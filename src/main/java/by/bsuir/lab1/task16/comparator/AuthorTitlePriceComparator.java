package by.bsuir.lab1.task16.comparator;

import by.bsuir.lab1.task12.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }
        int titleComparison = book1.getTitle().compareTo(book2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}
