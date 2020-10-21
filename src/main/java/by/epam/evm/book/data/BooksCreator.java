package by.epam.evm.book.data;

import by.epam.evm.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksCreator {

    private final Parser parser;
    private final BookValidator validator;

    public BooksCreator(Parser parser, BookValidator validator) {
        this.parser = parser;
        this.validator = validator;
    }

    public List<Book> create(List<String> data) throws DataException {
        List<Book> books = new ArrayList<>();
        Book book;
        for (String dataBook: data){
            if (validator.isCorrectData(dataBook)) {
                book = parser.parse(dataBook);
                books.add(book);
            }
        }
        return books;
    }
 }
