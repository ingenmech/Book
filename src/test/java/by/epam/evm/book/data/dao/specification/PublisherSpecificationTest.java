package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PublisherSpecificationTest {

    private final static List<Book> BOOKS = new ArrayList<>();

    static {
        BOOKS.add(new Book(10, "Title1", "Author Name", "Publisher"));
        BOOKS.add(new Book(11, "Title2", "Name Surname", "N/A"));
        BOOKS.add(new Book(12, "Title3", "Author Name", "N/A"));
    }

    @Test
    public void testFindShouldSearchBookByPublisherWhenBookDoesExist() {
        //given
        PublisherSpecification specification = new PublisherSpecification();
        List<Book> actual = new ArrayList<>();
        actual.add(new Book(10, "Title1", "Author Name", "Publisher"));
        //when
        List<Book> expected = specification.find(BOOKS, "Publisher");
        //then
        Assert.assertEquals(expected, actual);
    }
}
