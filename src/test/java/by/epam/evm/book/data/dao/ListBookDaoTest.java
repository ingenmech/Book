package by.epam.evm.book.data.dao;

import by.epam.evm.book.data.DataException;
import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBookDaoTest {

    private final static ListBookDao dao;

    static {
        List<Book> books = new ArrayList<>();
        books.add(new Book(2, "Title2", "Author2", "Publisher2"));
        books.add(new Book(3, "Title3", "Author3", "Publisher3"));
        books.add(new Book(1, "Title1", "Author1", "Publisher1"));
        dao = new ListBookDao(books);
    }

    @Test
    public void sizeShouldReturnListSizeWhen() throws DataException {
        //given
        int expectedSize = 3;
        //when
        int actualSize = dao.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void addBookShouldAddBookWhenBookDoesNotContainInList() throws DataException {
        //given
        int expectedSize = 4;
        Book book = new Book(4, "Title4", "Author4", "Publisher4");
        //when
        dao.addBook(book);
        int actualSize = dao.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test(expected = DataException.class)//then
    public void addBookShouldAddBookWhenBookIsContainInList() throws DataException {
        //given
        Book book = new Book(2, "Title2", "Author2", "Publisher2");
        //when
        dao.addBook(book);
    }

    @Test
    public void removeBookShouldAddBookWhenBookIsContainInList() throws DataException {
        //given
        int expectedSize = 3;
        Book book = new Book(4, "Title4", "Author4", "Publisher4");
        dao.addBook(book);
        dao.removeBook(book);
        //when
        int actualSize = dao.size();
        //then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test(expected = DataException.class)//then
    public void removeBookShouldRemoveBookWhenBookDoesNotContainInList() throws DataException {
        //given
        Book book = new Book(4, "Title4", "Author4", "Publisher4");
        //when
        dao.removeBook(book);
    }
}
