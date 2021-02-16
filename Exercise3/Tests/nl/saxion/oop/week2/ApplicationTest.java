package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createBookcases() {
        Bookcase bookcase1 = new Bookcase(10);
        Bookcase bookcase2 = new Bookcase(5);
    }

    @Test
    void createAuthors() {
        Author jkRowling = new Author("J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author sCollins = new Author("Suzanne Collins", LocalDate.of(1962, 8, 10));
    }

    @Test
    void addBooksToBookcases() {
        Bookcase bookcase1 = new Bookcase(10);
        Bookcase bookcase2 = new Bookcase(5);
        Author jkRowling = new Author("J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author sCollins = new Author("Suzanne Collins", LocalDate.of(1962, 8, 10));
        bookcase1.addBook(new Book("1", "Harry Potter and the Philospher's Stone", 223, jkRowling));
        bookcase1.addBook(new Book("2", "Harry Potter and the Chamber of Secrets", 251, jkRowling));
        bookcase1.addBook(new Book("3", "Harry Potter and the Prisoner of Azkaban", 317, jkRowling));
        bookcase1.addBook(new Book("4", "Harry Potter and the Goblet of Fire", 636, jkRowling));
        bookcase1.addBook(new Book("100", "The Hunger Games", 374, sCollins));
        bookcase1.addBook(new Book("101", "Catching Fire", 391, sCollins));
    }

    @Test
    void printStatistics() {
        Bookcase bookcase1 = new Bookcase(10);
        Bookcase bookcase2 = new Bookcase(5);
        Author jkRowling = new Author("J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author sCollins = new Author("Suzanne Collins", LocalDate.of(1962, 8, 10));
        bookcase1.addBook(new Book("1", "Harry Potter and the Philospher's Stone", 223, jkRowling));
        bookcase1.addBook(new Book("2", "Harry Potter and the Chamber of Secrets", 251, jkRowling));
        bookcase1.addBook(new Book("3", "Harry Potter and the Prisoner of Azkaban", 317, jkRowling));
        bookcase1.addBook(new Book("4", "Harry Potter and the Goblet of Fire", 636, jkRowling));
        bookcase1.addBook(new Book("100", "The Hunger Games", 374, sCollins));
        bookcase1.addBook(new Book("101", "Catching Fire", 391, sCollins));
        String returns = bookcase1.toString();
        String returns2 = bookcase2.toString();
    }
}