package by.epam.evm.book.data.comparator;

import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstPublisher = firstBook.getPublisher();
        String secondPublisher = secondBook.getPublisher();
        return firstPublisher.compareToIgnoreCase(secondPublisher);
    }
}
