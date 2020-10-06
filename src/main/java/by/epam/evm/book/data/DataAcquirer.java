package by.epam.evm.book.data;

import by.epam.evm.book.model.Book;

import java.util.List;

public interface DataAcquirer {
    List<Book> acquireBook() throws DataException;
}
