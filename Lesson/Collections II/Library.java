package collections2;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

public class Library {
    private ArrayList<Book> myBooks;

    public Library() {
        myBooks = new Treeset<Book>();
    }

    public boolean sortedInsert(Book newBook) {
        return myBooks.add(newBook);
    }

    public Book searchForIsbn(String isbn) {
        Collection<Book> ergebnis = new TreeSet();
        for(Book b : myBooks) {
            if(isbn.equals(b.getIsbn())) {
                return b;
            }
        }
        return null;
    }

    public Collection<Book> searchForAuthor(String author) {
        Collection<Book> ergebnis = new TreeSet();
        for(Book b : myBooks) {
            if(author.equals(b.getAuthor())) {
                ergebnis.add(b);
            }
        }
        return ergebnis;
    }

    public Map<String, Set<Book>> bestandNachAuthorenAuflisten() {
        Map<String, Set<Book>> ergebnis = new TreeMap<String,Set<Book>>();
        for(Book b : myBooks) {
            Set<Book> buecherEinesAuthors = ergebnis.get(b.getAuthor());
            if(buecherEinesAuthors == null) {
                buecherEinesAuthors = new TreeSet();
                ergebnis.put(b.getAuthor(), buecherEinesAuthors);
            }
            buecherEinesAuthors.add(b); //funktioniert, da bei put/get keine Kopie sondern das Original übergeben wird
        }
        return ergebnis;
    }
}
