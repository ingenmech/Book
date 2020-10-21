package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;

public class PublisherSpecification extends AbstractSpecification {

    @Override
    public String getField(Book book) {
        return book.getPublisher();
    }
}
