package by.epam.evm.book.data;

import by.epam.evm.book.data.comparator.ComparatorFactory;
import by.epam.evm.book.data.specification.Specification;
import by.epam.evm.book.data.specification.SpecificationFactory;
import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListBookDao implements BookDao {

    private List<Book> books;

    public ListBookDao(List<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) throws DataException {
        if (!isContained(book)) {
            throw new DataException("This book " + book.getTitle() + " was not found in the list");
        }
        books.add(book);
    }

    @Override
    public void removeBook(Book book) throws DataException {
        if (!isContained(book)){
            throw new DataException("This book " + book.getTitle() + " was not found in the list");
        }
        books.remove(book);
    }

    private boolean isContained(Book book) {
        int i = 0;
        boolean isContained = false;
        Book extractedBook;
        while (i < books.size()) {
            extractedBook = books.get(i);
            if (extractedBook.equals(book)) {
                isContained = true;
                break;
            }
            i++;
        }
        return isContained;
    }

    @Override
    public <T> List<Book> findByTag(Field field, T value) throws NotContainedFieldException {
        SpecificationFactory factory = new SpecificationFactory();
        Specification specification = factory.create(field);
        return specification.find(books, value);
    }

    @Override
    public List<Book> sortBooksByTag(Field field) throws NotContainedFieldException {
        ComparatorFactory factory = new ComparatorFactory();
        Comparator<Book> comparator = factory.create(field);
        List<Book> sortedList = new ArrayList<>(books);
        sortedList.sort(comparator);
        return sortedList;
    }
}
