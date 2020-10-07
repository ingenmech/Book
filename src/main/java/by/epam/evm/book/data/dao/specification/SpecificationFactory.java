package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.data.DataException;
import by.epam.evm.book.data.dao.Field;

public class SpecificationFactory {

    public Specification create(Field field) throws DataException {
        Specification specification = null;

        switch (field) {
            case TITLE:
                specification =new TitleSpecification();
                break;
            case AUTHOR:
                specification = new AuthorSpecification();
                break;
            case PUBLISHER:
                specification = new PublisherSpecification();
                break;
            case ID :
                specification = new IdSpecification();
                break;
            default:
                throw new DataException("Field not exist in the listing" + " = " + field);
        }
        return specification;
    }
}
