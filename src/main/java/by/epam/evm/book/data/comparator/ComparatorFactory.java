package by.epam.evm.book.data.comparator;

import by.epam.evm.book.data.Field;
import by.epam.evm.book.data.NotContainedFieldException;
import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(Field field) throws NotContainedFieldException {
        Comparator<Book> comparator;
        switch (field) {
            case TITLE:
                comparator = new TitleComparator();
                break;
            case AUTHOR:
                comparator = new AuthorComparator();
                break;
            case PUBLISHER:
                comparator = new PublisherComparator();
                break;
            case ID:
                comparator = new IdComparator();
                break;
            default:
                throw new NotContainedFieldException("Field not exist in the listing" + " = " + field);

        }
        return comparator;
    }
}
