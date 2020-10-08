package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;

public class AuthorSpecification extends AbstractSpecification {

    @Override
    public String getField(Book book) {
        return book.getAuthor();
    }
}
