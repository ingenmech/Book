package by.epam.evm.book.data;

public interface Parser {
    <T> T parse(String data) throws DataException;
}
