package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.data.dao.Field;
import by.epam.evm.book.data.dao.InputException;

public class SpecificationFactory {

    public Specification create(Field field) {
        Specification specification = null;

        switch (field) {
            case TITLE:
                specification = new TitleSpecification();
                break;
            case AUTHOR:
                specification = new AuthorSpecification();
                break;
            case PUBLISHER:
                specification = new PublisherSpecification();
                break;
            case ID:
                specification = new IdSpecification();
                break;
            default:
                throw new InputException("Field not exist in the listing" + " = " + field);
        }
        return specification;
    }
}
