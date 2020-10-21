package by.epam.evm.book.data;

import org.junit.Assert;
import org.junit.Test;

public class DataBookValidatorTest {


    @Test
    public void testIsCorrectDataShouldReturnTrueWhenDataDoesMatchesPattern(){
        //given
        DataBookValidator validator = new DataBookValidator();
        //when
        Boolean actual = validator.isCorrectData( "<1><Title1><Author1><Publisher1>");
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsCorrectDataShouldReturnFalseWhenDataDoesNotMatchesPattern(){
        //given
        DataBookValidator validator = new DataBookValidator();
        //when
        Boolean actual = validator.isCorrectData( "<1><Title1><Publisher1>");
        //then
        Assert.assertFalse(actual);
    }
}
