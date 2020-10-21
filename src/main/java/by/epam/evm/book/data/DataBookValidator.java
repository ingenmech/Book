package by.epam.evm.book.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBookValidator implements BookValidator{

    private final static String BOOK_PATTERN = "<\\d+>(<.+>){3}";

    public boolean isCorrectData(String dataBook){
        Pattern pattern = Pattern.compile(BOOK_PATTERN);
        Matcher matcher = pattern.matcher(dataBook);
        return matcher.matches();
    }
}
