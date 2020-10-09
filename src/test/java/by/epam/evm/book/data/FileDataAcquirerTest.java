package by.epam.evm.book.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirerTest {

    private final static String FILE_NAME = "src/test/resources/inputTest.txt";

    @Test
    public void testAcquireBookShouldReadAllStringAndReturnListWhenFileDoesExist() throws DataException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer(FILE_NAME);
        List<String> expected = new ArrayList<>();
        expected.add("<1><Title1><Author1><Publisher1>");
        expected.add("<2><Title2><Author2><Publisher2>");
        //when
        List<String> actual = acquirer.acquireBook();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = DataException.class)//then
    public void testAcquireBookShouldThrowExceptionWhenFileDoesNotExist() throws DataException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer("src/test/resources/i.txt");
        //when
        List<String> actual = acquirer.acquireBook();
    }
}
