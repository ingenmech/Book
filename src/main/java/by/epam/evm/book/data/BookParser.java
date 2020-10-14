package by.epam.evm.book.data;

import by.epam.evm.book.model.Book;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookParser implements Parser {
    private final static String BOOK_PATTERN = "<(\\d+)><(.+)><(.+)><(.+)>";
    private final static int ID_GROUP = 1;
    private final static int TITLE_GROUP = 2;
    private final static int AUTHOR_GROUP = 3;
    private final static int PUBLISHER_GROUP = 4;

    public Book parse(String data) throws DataException {
        Pattern pattern = Pattern.compile(BOOK_PATTERN);
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
            String stringId = matcher.group(ID_GROUP);
            int id = Integer.parseInt(stringId);
            String title = matcher.group(TITLE_GROUP);
            String author = matcher.group(AUTHOR_GROUP);
            String publisher = matcher.group(PUBLISHER_GROUP);
            return new Book(id, title, author, publisher);
        } else {
            throw new DataException("Data format is not correct" + data);
        }
    }
}
