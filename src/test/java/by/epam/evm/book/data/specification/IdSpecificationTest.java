package by.epam.evm.book.data.specification;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IdSpecificationTest {

    private final static List<Book> BOOKS = new ArrayList<>();

    static {
        BOOKS.add(new Book(10, "Title1", "Author Name", "N/A"));
        BOOKS.add(new Book(11, "Title2", "Name Surname", "N/A"));
        BOOKS.add(new Book(12, "Title3", "Author Name", "N/A"));
    }

    @Test
    public void testFindShouldFindBookByIdWhenDataIsCorrect() {
        //given
        IdSpecification specification = new IdSpecification();
        List<Book> actual = new ArrayList<>();
        actual.add(new Book(10, "Title1", "Author Name", "N/A"));
        //when
        List<Book> expected = specification.find(BOOKS, 10);
        //then
        Assert.assertEquals(expected, actual);
    }
}
