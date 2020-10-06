package by.epam.evm.book.data.comparator;

import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();
        return firstTitle.compareToIgnoreCase(secondTitle);
    }
}
