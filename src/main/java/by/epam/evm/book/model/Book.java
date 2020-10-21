package by.epam.evm.book.model;

public final class Book {
    private final int id;
    private final String title;
    private final String author;
    private final String publisher;

    public Book(int id, String title, String author, String pagesNumber) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = pagesNumber;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;
        if (id != book.id){
            return false;
        }
        if (title != null ? !title.equals(book.title) : book.title != null){
            return false;
        }
        if (author != null ? !author.equals(book.author) : book.author != null) {
            return false;
        }
        return publisher != null ? publisher.equals(book.publisher) : book.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
