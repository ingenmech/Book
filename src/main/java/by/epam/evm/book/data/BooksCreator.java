package by.epam.evm.book.data;

import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksCreator {
    private final BookParser parser = new BookParser();
    private final DataBookValidator validator = new DataBookValidator();

    public List<Book> create(List<String> data) throws DataException {
        List<Book> books = new ArrayList<>();
        Book book;
        String bookPattern = BookParser.getBookPattern();
        for (String dataBook: data){
            if (validator.validate(bookPattern, dataBook)) {
                book = parser.parse(dataBook);
                books.add(book);
            }
        }
        return books;
    }
 }
