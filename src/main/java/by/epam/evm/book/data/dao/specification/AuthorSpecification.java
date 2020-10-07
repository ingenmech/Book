package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorSpecification implements Specification {
    @Override
    public <T> List<Book> find(List<Book> books, T value) {
        List<Book> foundBooks = new ArrayList<>();
        String author;
        String searchString = String.valueOf(value);
        for (Book book : books) {
            author = book.getAuthor();
            if (author.equalsIgnoreCase(searchString)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
