package by.epam.evm.book.view;

import by.epam.evm.book.model.Book;
import org.apache.log4j.Logger;

import java.util.List;

public class ConsolePrinter {
    private final static Logger LOGGER = Logger.getLogger(ConsolePrinter.class);

    public void printLog(List<Book> books){
        for (Book book : books){
            LOGGER.info(book.toString());
        }
    }
}
