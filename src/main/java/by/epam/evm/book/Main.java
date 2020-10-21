package by.epam.evm.book;

import by.epam.evm.book.data.*;
import by.epam.evm.book.data.dao.BookDao;
import by.epam.evm.book.data.dao.Field;
import by.epam.evm.book.data.dao.ListBookDao;
import by.epam.evm.book.model.Book;
import by.epam.evm.book.view.ListPrinter;
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

    private static void run() throws DataException {
        LOGGER.info("started");
        DataReader dataAcquirer = new FileDataReader("input.txt");
        List<String> dataBooks = dataAcquirer.read();

        BookValidator validator = new DataBookValidator();
        Parser parser = new BookParser();
        BooksCreator booksCreator = new BooksCreator(parser, validator);
        List<Book> books = booksCreator.create(dataBooks);

        BookDao dao = new ListBookDao(books);
        List<Book> foundBooks = dao.findByTag(Field.ID, 3);
        ListPrinter printer = new ListPrinter();
        String printBook = printer.print(foundBooks);
        LOGGER.info("Found book " + printBook);

        List<Book> sortedBook = dao.sortBooksByTag(Field.ID);
        printBook = printer.print(sortedBook);
        LOGGER.info("Sorted book " + printBook);

        Book newBook = new Book(1, "New Book", "Author", "Publisher");
        LOGGER.info("Size before add book = " + dao.size());
        dao.addBook(newBook);
        LOGGER.info("Size after add book = " + dao.size());
        dao.removeBook(newBook);
        LOGGER.info("Size after remove book = " + dao.size());

    }


}
