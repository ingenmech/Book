package by.epam.evm.book.data.dao.specification;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AuthorSpecificationTest {

    private final static List<Book> BOOKS = Arrays.asList(
            new Book(10, "Title1", "Author Name", "Publisher"),
            new Book(11, "Title2", "Name Surname", "N/A"),
            new Book(12, "Title3", "Author Name", "N/A"));

    @Test
    public void testFindShouldSearchBookByAuthorWhenBookDoesExist() {
        //given
        Book firstBook =new Book(10, "Title1", "Author Name", "N/A");
        Book secondBook =new Book(12, "Title3", "Author Name", "N/A");
        List<Book> actual = Arrays.asList(firstBook,secondBook);
        AuthorSpecification specification = new AuthorSpecification();
        //when
        List<Book> expected = specification.find(BOOKS, "Author Name");
        //then
        Assert.assertEquals(expected, actual);
    }
}
