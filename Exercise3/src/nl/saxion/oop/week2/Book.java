package nl.saxion.oop.week2;

public class Book {
    private String isbnNr;
    private String title;
    private int nrOfPages;
    private Author author;

    public Book(String isbnNr, String title,int nrOfPages, Author author) {
        this.isbnNr = isbnNr;
        this.title = title;
        this.nrOfPages = nrOfPages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title;
    }
}
