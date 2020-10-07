package by.epam.evm.book;

import by.epam.evm.book.data.*;
import by.epam.evm.book.data.dao.BookDao;
import by.epam.evm.book.data.dao.Field;
import by.epam.evm.book.data.dao.ListBookDao;
import by.epam.evm.book.model.Book;
import by.epam.evm.book.view.ConsolePrinter;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            run();
        } catch (DataException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private static void run() throws DataException{
        LOGGER.info("started");
        FileDataAcquirer dataAcquirer = new FileDataAcquirer("input.txt");
        List<String> dataBooks = dataAcquirer.acquireBook();
        BooksCreator booksCreator = new BooksCreator();
        List<Book> books = booksCreator.create(dataBooks);

        BookDao dao = new ListBookDao(books);
        List<Book> authorBooks = dao.findByTag(Field.AUTHOR, "Joanne Rowling");
        List<Book> idBooks = dao.findByTag(Field.ID, 3);

        ConsolePrinter printer = new ConsolePrinter();
        printer.printLog(authorBooks);
        printer.printLog(idBooks);
    }


}
