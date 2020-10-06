package by.epam.evm.book.data.specification;

import by.epam.evm.book.data.Field;
import by.epam.evm.book.data.NotContainedFieldException;

public class SpecificationFactory {

    public Specification create(Field field) throws NotContainedFieldException {
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
                throw new NotContainedFieldException("Field not exist in the listing" + " = " + field);
        }
        return specification;
    }
}
