package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PublisherSpecificationTest {

    private final static List<Book> BOOKS;

    static {
        Book firstBook = new Book(10, "Title1", "Author Name", "Publisher");
        Book secondBook = new Book(11, "Title2", "Name Surname", "N/A");
        Book thirdBook = new Book(12, "Title3", "Author Name", "N/A");
        BOOKS = Arrays.asList(firstBook, secondBook, thirdBook);
    }

    @Test
    public void testFindShouldSearchBookByPublisherWhenBookDoesExist() {
        //given
        List<Book> actual = new ArrayList<>();
        actual.add(new Book(10, "Title1", "Author Name", "Publisher"));
        PublisherSpecification specification = new PublisherSpecification();
        //when
        List<Book> expected = specification.find(BOOKS, "Publisher");
        //then
        Assert.assertEquals(expected, actual);
    }
}
