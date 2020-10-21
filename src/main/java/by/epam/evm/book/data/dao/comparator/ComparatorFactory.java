package by.epam.evm.book.data.dao.comparator;

import by.epam.evm.book.data.dao.Field;
import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(Field field) {
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
                throw new IllegalArgumentException("Field not exist in the listing" + " = " + field);
        }
        return comparator;
    }
}
