package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class TitleSpecification  implements Specification{
    @Override
    public <T> List<Book> find(List<Book> books, T value) {
        List<Book> foundBooks = new ArrayList<>();
        String title;
        String searchValue = String.valueOf(value);
        for (Book book : books) {
            title = book.getTitle();
            if (title.equalsIgnoreCase(searchValue)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
