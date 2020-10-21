package by.epam.evm.book.data.dao.comparator;

import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstAuthor = firstBook.getAuthor();
        String secondAuthor = secondBook.getAuthor();
        return firstAuthor.compareToIgnoreCase(secondAuthor);
    }
}
