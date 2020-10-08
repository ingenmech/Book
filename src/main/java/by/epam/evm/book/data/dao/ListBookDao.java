package by.epam.evm.book.data.dao;

import by.epam.evm.book.data.DataException;
import by.epam.evm.book.data.dao.comparator.ComparatorFactory;
import by.epam.evm.book.data.dao.specification.Specification;
import by.epam.evm.book.data.dao.specification.SpecificationFactory;
import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListBookDao implements BookDao {

    private final static ComparatorFactory COMPARATOR_FACTORY = new ComparatorFactory();
    private final static SpecificationFactory SPECIFICATION_FACTORY = new SpecificationFactory();
    private final List<Book> books;

    public ListBookDao(List<Book> books) {
        this.books = books;
    }

    @Override
    public int size() {
        return books.size();
    }

    @Override
    public void addBook(Book book) throws DataException {
        if (books.contains(book)) {
            throw new DataException("This book " + book.getTitle() + " was not found in the list");
        }
        books.add(book);
    }

    @Override
    public void removeBook(Book book) throws DataException {
        if (!books.contains(book)) {
            throw new DataException("This book " + book.getTitle() + " was not found in the list");
        }
        books.remove(book);
    }

    @Override
    public <T> List<Book> findByTag(Field field, T value) throws DataException {
        Specification specification = SPECIFICATION_FACTORY.create(field);
        return specification.find(books, value);
    }

    @Override
    public List<Book> sortBooksByTag(Field field) throws DataException {
        Comparator<Book> comparator = COMPARATOR_FACTORY.create(field);
        List<Book> sorted = new ArrayList<>(books);
        sorted.sort(comparator);
        return sorted;
    }
}
