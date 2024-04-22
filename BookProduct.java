public class BookProduct extends product {
    protected String author;
    protected String publisher;

    public BookProduct(int productId, String name, float price,String author, String publisher) {
        super(productId, name, price);
        this.author=author;
        this.publisher=publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
