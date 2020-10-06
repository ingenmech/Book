package by.epam.evm.book.data;

import by.epam.evm.book.model.Book;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer{

    private final static Logger LOGGER = Logger.getLogger(FileDataAcquirer.class);
    private final String fileName;

    public FileDataAcquirer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Book> acquireBook() throws DataException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            List<Book> books = new ArrayList<>();
            Book book;
            BookParser parser = new BookParser();
            String line;
            while ((line = reader.readLine()) != null) {
                book = parser.parse(line);
                books.add(book);
            }
            return books;

        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), e);
                }
            }
        }
    }
}
