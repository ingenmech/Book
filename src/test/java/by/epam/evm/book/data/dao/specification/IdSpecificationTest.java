package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdSpecificationTest {

    private final static List<Book> BOOKS = Arrays.asList(
            new Book(10, "Title1", "Author Name", "Publisher"),
            new Book(11, "Title2", "Name Surname", "N/A"),
            new Book(12, "Title3", "Author Name", "N/A"));

    @Test
    public void testFindShouldSearchBookByIdWhenBookDoesExist() {
        //given
        List<Book> actual = new ArrayList<>();
        actual.add(new Book(10, "Title1", "Author Name", "N/A"));
        IdSpecification specification = new IdSpecification();
        //when
        List<Book> expected = specification.find(BOOKS, 10);
        //then
        Assert.assertEquals(expected, actual);
    }
}
