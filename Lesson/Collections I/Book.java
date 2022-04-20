package collections1;

public class Book {
    private String isbn;
    private String author;
    private String title;

    public Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public Book(String isbn) {
        this.isbn = isbn;
        author = "";
        title = "";
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Book b) {
        return Integer.parseInt(isbn) - Integer.parseInt(b.isbn);
    }
}
