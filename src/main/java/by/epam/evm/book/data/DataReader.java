package by.epam.evm.book.data;

import java.util.List;

public interface DataReader {
    List<String> read() throws DataException;
}
