package by.epam.evm.book.data.dao.comparator;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IdComparatorTest {

    private final static List<Book> EXPECTED;

    static {
        Book firstBook = new Book(1, "Title1", "Author1", "Publisher1");
        Book secondBook = new Book(2, "Title2", "Author2", "Publisher2");
        Book thirdBook = new Book(3, "Title3", "Author3", "Publisher3");
        EXPECTED = Arrays.asList(firstBook, secondBook, thirdBook);
    }

    @Test
    public void testSortShouldSortListByIdWhenDataCorrect() {
        //given
        Book firstBook = new Book(2, "Title2", "Author2", "Publisher2");
        Book secondBook = new Book(3, "Title3", "Author3", "Publisher3");
        Book thirdBook = new Book(1, "Title1", "Author1", "Publisher1");
        List<Book> actual = Arrays.asList(firstBook,secondBook,thirdBook);
        IdComparator comparator = new IdComparator();
        //when
        actual.sort(comparator);
        //then
        Assert.assertEquals(EXPECTED, actual);
    }
}
