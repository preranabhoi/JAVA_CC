/*1. Library Management System — OOP
Create a Book class with:
title
author
price
Requirements:

Create 2 Book objects.
Use a constructor to initialize the data.
Create a method displayBook() to display details.

Use private variables with getters and setters.
*/

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) { 
            this.price = price;
        }
    }

 
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 15.99);
        Book book2 = new Book("1844", "George Orwell", 12.50);

        book2.setTitle("1984");

        System.out.println("--- Library Catalogue ---");
        book1.displayBook();
        book2.displayBook();
    }
}
