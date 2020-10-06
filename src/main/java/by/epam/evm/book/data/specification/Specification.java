package by.epam.evm.book.data.specification;

import by.epam.evm.book.model.Book;

import java.util.List;

public interface Specification {
    <T> List<Book> find(List<Book> books, T value);
}
