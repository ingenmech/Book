package by.epam.evm.book.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FileDataAcquirerTest {

    private final static String FILE_NAME = "src/test/resources/inputTest.txt";

    @Test
    public void testAcquireBookShouldReadAllStringAndReturnListWhenFileDoesExist() throws DataException {
        //given
        String firstLine = "<1><Title1><Author1><Publisher1>";
        String secondLine = "<2><Title2><Author2><Publisher2>";
        List<String> expected = Arrays.asList(firstLine,secondLine);
        FileDataReader acquirer = new FileDataReader(FILE_NAME);
        //when
        List<String> actual = acquirer.read();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = DataException.class)//then
    public void testAcquireBookShouldThrowExceptionWhenFileDoesNotExist() throws DataException {
        //given
        FileDataReader acquirer = new FileDataReader("src/test/resources/i.txt");
        //when
        List<String> actual = acquirer.read();
    }
}
