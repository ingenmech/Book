package by.epam.evm.book.data.comparator;

import by.epam.evm.book.model.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstAuthor = firstBook.getAuthor();
        String secondAuthor = secondBook.getAuthor();
//        int result = 0;
//        if (firstAuthor.compareToIgnoreCase(secondAuthor) > 0){
//            result  = 1;
//        } else (firstAuthor.compareToIgnoreCase(secondAuthor) < 0){
//            result = -1;
//        }
        return firstAuthor.compareToIgnoreCase(secondAuthor);
    }
}
