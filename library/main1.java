package library;
/*2) Library System — Package
Create a package named library.
Inside the package:
Create a Book class.
Add title, author, and price.

Create a displayBook() method.
Outside the package:

Create a Main class.
Import the Book class.

Create 2 Book objects.
Display their details.
 */

public class main1 {
    public static void main(String[] args) {
        // Creating 2 Book objects outside the package
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 14.99);
        Book book2 = new Book("Brave New World", "Aldous Huxley", 11.25);

        // Displaying details using the imported class method
        System.out.println("--- Library System (Package Demo) ---");
        book1.displayBook();
        book2.displayBook();
    }
}
