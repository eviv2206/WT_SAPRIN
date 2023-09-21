package by.bsuir.lab1.task16.comparator;

import by.bsuir.lab1.task12.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
