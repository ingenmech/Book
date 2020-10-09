package by.epam.evm.book.data;

import org.junit.Assert;
import org.junit.Test;

public class DataBookValidatorTest {

    private final static String DATA_PATTERN = "<(\\d+)><(.+)><(.+)><(.+)>";

    @Test
    public void testIsCorrectDataShouldReturnTrueWhenDataDoesMatchesPattern(){
        //given
        DataBookValidator validator = new DataBookValidator();
        //when
        Boolean actual = validator.isCorrectData(DATA_PATTERN, "<1><Title1><Author1><Publisher1>");
        //then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testIsCorrectDataShouldReturnFalseWhenDataDoesNotMatchesPattern(){
        //given
        DataBookValidator validator = new DataBookValidator();
        //when
        Boolean actual = validator.isCorrectData(DATA_PATTERN, "<1><Title1><Publisher1>");
        //then
        Assert.assertEquals(false, actual);
    }
}
