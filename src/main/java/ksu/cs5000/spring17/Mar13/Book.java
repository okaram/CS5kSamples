package ksu.cs5000.spring17.Mar13;

import java.math.BigDecimal;

public class Book {

    private static int numBooks=0;

    Book() {
        ++numBooks;
    }

    public static int getNumBooks() { return numBooks;}
    public String ISBN;
    public String title, author, publisher, category;
    public BigDecimal price;
    public int publicationYear;


}
