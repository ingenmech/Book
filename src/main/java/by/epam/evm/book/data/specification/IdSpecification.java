package by.epam.evm.book.data.specification;

import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class IdSpecification implements Specification{
    @Override
    public <T> List<Book> find(List<Book> books, T value) {
        List<Book> foundBooks = new ArrayList<>();
        Integer id;
        for (Book book : books) {
            id = book.getId();
            if (id.equals(value)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
