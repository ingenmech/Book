package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;

public class IdSpecification extends AbstractSpecification{

    @Override
    public Integer getField(Book book) {
        return book.getId();
    }
}
