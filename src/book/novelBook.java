package book;

public class novelBook extends Book {
    private String author;

    public novelBook(String name, long price, int quantity, String dateCreated, String author) {
        super(name, price, quantity, dateCreated);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "NovelBook{" + super.toString() +
                "author='" + author + '\'' +
                '}';
    }
}
