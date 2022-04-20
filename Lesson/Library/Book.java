public class Book {

    private String title;
    private boolean lend;

    public Book(String title) {
        this.title = title;
        this.lend = false;
    }

    public String getTitle() {
      return title;
    }

    public void setLend(boolean lend) {
        this.lend = lend;
    }

    public boolean getLend() {
        return lend;
    }

    public String toString() {
        return title;
    }

}
