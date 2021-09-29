package labsheet4.exercise3;

public class Book {
    String title;
    double price;
    String isbn;
    int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Title: " + getTitle() + " Price: " + getPrice() + " ISBN: " + getIsbn() + " Pages: " + getPages();
    }

    public Book() {
        this("Title Not available",0.00,"ISBN Not available",0);
    }

    public Book(String title, double price, String isbn, int pages) {
        setTitle(title);
        setPrice(price);
        setIsbn(isbn);
        setPages(pages);
    }
}
