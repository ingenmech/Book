package by.epam.evm.book.view;

import by.epam.evm.book.model.Book;


import java.util.List;

public class ListPrinter {
    public String print(List<Book> books){
        StringBuilder result = new StringBuilder();
        String data;
        for (Book book : books){
            data = book.toString();
            result.append(data);
            result.append('\n');
        }
        return result.toString();
    }
}
