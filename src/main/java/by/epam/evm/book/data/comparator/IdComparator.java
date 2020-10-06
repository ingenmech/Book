package by.epam.evm.book.data.comparator;

import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int firstId = firstBook.getId();
        int secondId = secondBook.getId();
        int result = 0;
        if (firstId > secondId) {
            result = 1;
        } else if (firstId > secondId) {
            result = -1;
        }
        return result;
    }
}
