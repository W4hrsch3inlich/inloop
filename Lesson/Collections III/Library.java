package collections2;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

public class Library {
    private Map<String, Set<Book>> myBooks;

    public Library() {
        myBooks = new Map<String, <Book>>();
    }

    public boolean sortedInsert(Book newBook) {
        String author = newBook.getAuthor();
        if(!myBooks.containsKey(author)) {
            myBooks.put(author, new TreeSet<Book>())
        }
        Set<Book> buecherDesAutors = myBooks.get(author);
        return buecherDesAutors.add(newBook);
    }

    public Book searchForIsbn(String isbn) {
        for(Set<Book> buecher : myBooks.values()) {
            for(Book b : buecher) {
                if(isbn.equals(b.getIsbn())){
                    return b;
                }
            }
        }
    }

    public Collection<Book> searchForAuthor(String author) {
        Set<Book> buecherEinesAutors = myBooks.get(author);
        if(buecherEinesAutors == null) {
            return Collections.emptySet();
        }
        return buecherEinesAutors;
    }

    public Map<String, Set<Book>> bestandNachAuthorenAuflisten() {
        return myBooks;
    }
}
