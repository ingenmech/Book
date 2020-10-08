package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecification implements Specification{
    public <T> List<Book> find(List<Book> books, T value) {
        List<Book> foundBooks = new ArrayList<>();
        T field;
        for (Book book : books) {
            field = getField(book);
            if (field.equals(value)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }


    public abstract <T> T getField(Book book);
}
