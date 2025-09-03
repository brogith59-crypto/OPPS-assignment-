class Book {
 String title;
 String author;
 boolean isAvailable;
 // Constructor Book(String title, String author, boolean isAvailable) {
 this.title = title;
 this.author = author;
 this.isAvailable = isAvailable;
 }
 
// Method to check availability
 boolean isAvailable() { return isAvailable; }
/ Method to borrow book void borrowBook() { if (isAvailable) {
 System.out.println(title + " has been borrowed successfully.");
 isAvailable = false; // mark as borrowed } else { System.out.println(title + " is
 not available for borrowing."); } }
 }
 public class Library {
 public static void main(String[] args) {
 // Create book objects
 Book b1 = new Book("The Alchemist", "Paulo Coelho", true); Book b2 = new
 Book("Harry Potter", "J.K. Rowling", false);
 // Check and borrow books
 System.out.println("Is " + b1.title + " available? " + b1.isAvailable());
 b1.borrowBook(); // Borrowing book
 b1.borrowBook(); // Trying again
 System.out.println("Is "" + b2.title + " available? " + b2.isAvailable());
 b2.borrowBook(); // Already not available }
 }
