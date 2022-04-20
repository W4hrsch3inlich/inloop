package collections1;

import java.util.Collections;

public class Library {
    private ArrayList<Book> myBooks;

    public Library() {
        myBooks = new ArrayList<Book>();
    }

    public boolean insertBook(Book newBook) {
        int position = Collections.binarySearch(myBooks, new Book(newBook.getIsbn()));
        myBooks.add(-position - 1, newBook);
        return true;
    }

    public Book searchForIsbn(String isbn) {
        int position = Collections.binarySearch(myBooks, new Book(isbn));
        return myBooks[position];
    }

    public Collection<Book> searchForAuthor(String author) {
        ArrayList<Book> r = new ArrayList<Book>();
        for(Book b : myBooks) {
            if(b.author.matches(author)) r.add(b);
        }
        return r;
    }
}
