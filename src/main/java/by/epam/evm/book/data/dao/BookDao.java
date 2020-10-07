package by.epam.evm.book.data.dao;

import by.epam.evm.book.data.DataException;
import by.epam.evm.book.model.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book) throws DataException;
    void removeBook(Book book) throws DataException;
    <T> List<Book> findByTag(Field field, T value) throws DataException;
    List<Book> sortBooksByTag(Field field) throws DataException;
}
