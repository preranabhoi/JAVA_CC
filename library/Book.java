// File: src/library/Book.java
package library;

public class Book {
    // Encapsulation: Fields are private
    private String title;
    private String author;
    private double price;

    // Constructor must be 'public' so it can be called outside the package
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters must be public to be accessible outside the package
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Method must be 'public' to be executed from Main
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }
}
