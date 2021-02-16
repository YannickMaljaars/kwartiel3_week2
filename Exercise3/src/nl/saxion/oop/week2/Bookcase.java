package nl.saxion.oop.week2;

import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books = new ArrayList<>();
    private int size;

    public Bookcase(int size){
        this.size = size;
    }

    public void addBook(Book b){
        this.books.add(b);
    }

    public ArrayList<Book> getBooksFromAuthor(String author) {
        ArrayList<Book> booksFromAuthor = new ArrayList<>();
        for (Book b:
             books) {
            if(b.getAuthor().getName().equals(author)) {
                booksFromAuthor.add(b);
            }
        }
        return booksFromAuthor;
    }

    @Override
    public String toString() {
        return books.toString();
    }
}
