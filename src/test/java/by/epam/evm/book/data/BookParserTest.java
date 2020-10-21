package by.epam.evm.book.data;

import by.epam.evm.book.model.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookParserTest {

    private final static String DATA_BOOK = "<1><Title1><Author1><Publisher1>";

    @Test
    public void testParseShouldParseDataStringToBookWhenDataCorrect() throws DataException {
        //given
        BookParser parser = new BookParser();
        Book expected = new Book(1, "Title1", "Author1", "Publisher1");
        //when
        Book actual = parser.parse(DATA_BOOK);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = DataException.class)//then
    public void testParseShouldParseDataStringToBookWhenDataInvalid() throws DataException {
        //given
        BookParser parser = new BookParser();
        String invalidData = "<1>.<Title1>.<Author1><Publisher1>";
        //when
        Book actual = parser.parse(invalidData);
    }
}
