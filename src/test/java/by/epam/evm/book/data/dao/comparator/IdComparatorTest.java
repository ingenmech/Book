package by.epam.evm.book.data.dao.comparator;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IdComparatorTest {
    private final static List<Book> EXPECTED = new ArrayList<>();

    static {
        EXPECTED.add(new Book(1, "Title1", "Author1", "Publisher1"));
        EXPECTED.add(new Book(2, "Title2", "Author2", "Publisher2"));
        EXPECTED.add(new Book(3, "Title3", "Author3", "Publisher3"));
    }

    @Test
    public void testSortShouldSortListByIdWhenDataCorrect(){
        //given
        IdComparator comparator = new IdComparator();
        List<Book> actual = new ArrayList<>();
        actual.add(new Book(2, "Title2", "Author2", "Publisher2"));
        actual.add(new Book(3, "Title3", "Author3", "Publisher3"));
        actual.add(new Book(1, "Title1", "Author1", "Publisher1"));
        //when
        actual.sort(comparator);
        //then
        Assert.assertEquals(EXPECTED, actual);
    }
}
