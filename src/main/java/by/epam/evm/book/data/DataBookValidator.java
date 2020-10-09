package by.epam.evm.book.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBookValidator {

    public boolean isCorrectData(String bookPatter, String dataBook){
        Pattern pattern = Pattern.compile(bookPatter);
        Matcher matcher = pattern.matcher(dataBook);
        return matcher.matches();
    }
}
