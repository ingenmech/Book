package by.epam.evm.book.data.dao;

import by.epam.evm.book.data.DataException;
import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBookDaoTest {

    private final static Book FIRST_BOOK = new Book(2, "Title2", "Author2", "Publisher2");
    private final static Book SECOND_BOOK = new Book(3, "Title3", "Author3", "Publisher3");
    private final static Book THIRD_BOOK = new Book(1, "Title1", "Author1", "Publisher1");
    private final static ListBookDao DAO;

    static {
        List<Book> books = new ArrayList<>();
        books.add(FIRST_BOOK);
        books.add(SECOND_BOOK);
        books.add(THIRD_BOOK);
        DAO = new ListBookDao(books);
    }

    @Test
    public void testSizeShouldReturnListSizeWhen() throws DataException {
        //given
        int expectedSize = 3;
        //when
        int actualSize = DAO.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAddBookShouldAddBookWhenBookDoesNotContainInList() throws DataException {
        //given
        int expectedSize = 4;
        Book book = new Book(4, "Title4", "Author4", "Publisher4");
        //when
        DAO.addBook(book);
        //then
        int actualSize = DAO.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test(expected = DataException.class)//then
    public void testAddBookShouldAddBookWhenBookIsContainInList() throws DataException {
        //given
        Book book = new Book(2, "Title2", "Author2", "Publisher2");
        //when
        DAO.addBook(book);
    }

    @Test
    public void testRemoveBookShouldAddBookWhenBookIsContainInList() throws DataException {
        //given
        int expectedSize = 2;
        Book book = new Book(4, "Title4", "Author4", "Publisher4");
        //when
        DAO.removeBook(FIRST_BOOK);
        int actualSize = DAO.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test(expected = DataException.class)//then
    public void testRemoveBookShouldRemoveBookWhenBookDoesNotContainInList() throws DataException {
        //given
        Book book = new Book(4, "Title4", "Author4", "Publisher4");
        //when
        DAO.removeBook(book);
    }
}
