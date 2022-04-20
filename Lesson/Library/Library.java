public class Library {
    private Book[] myBooks;
    private int number;

    public Library() {
        myBooks = new Book[10];
        number = 0;
        System.out.println("Hello, I am a small library for at most 10 books.");
    }

    public void register(Book book) {
        myBooks[number] = book;
        number += 1;
        System.out.println("A new book is registered: " + book);  // impliziter book.toString() Aufruf
    }

    public Book search(String title, boolean onlySearchNotLend) {
      for(Book book : myBooks) {
        if(book.getTitle().equals(title) && (!onlySearchNotLend || book.getLend())) {
          return book;
        }
      }
      System.out.println("The book " + title + " is not in the library.");
      return null;
    }

    public void loan(String title) {
      Book book = search(title, true);
      if(book != null){
        book.setLend(true);
      }
    }
}
