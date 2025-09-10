package bookstore;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int isbn;
    private int pageNumber;

    public Book(String title, String author, int isbn, int pageNumber) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pageNumber = pageNumber;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }

    public int getPageNumber() { return pageNumber; }
    public void setPageNumber(int pageNumber) { this.pageNumber = pageNumber; }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ", Pages: " + pageNumber + ")";
    }
}

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\nBookstore Menu:");
            System.out.println("1. Add book");
            System.out.println("2. Edit book");
            System.out.println("3. Delete book");
            System.out.println("4. List books");
            System.out.println("99. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            if (choice == 1) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Author: ");
                String author = scanner.nextLine();
                System.out.print("ISBN: ");
                int isbn = scanner.nextInt();
                System.out.print("Page count: ");
                int pageNumber = scanner.nextInt();
                scanner.nextLine(); // consume newline
                books.add(new Book(title, author, isbn, pageNumber));
                System.out.println("Book added!");
            }
            else if (choice == 2) {
                System.out.print("Enter title of book to edit: ");
                String oldTitle = scanner.nextLine();
                boolean found = false;

                for (Book b : books) {
                    if (b.getTitle().equalsIgnoreCase(oldTitle)) {
                        System.out.print("New title: ");
                        b.setTitle(scanner.nextLine());
                        System.out.print("New author: ");
                        b.setAuthor(scanner.nextLine());
                        System.out.print("New ISBN: ");
                        b.setIsbn(scanner.nextInt());
                        System.out.print("New page count: ");
                        b.setPageNumber(scanner.nextInt());
                        scanner.nextLine(); // consume newline
                        System.out.println("Book updated!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book not found.");
                }
            }
            else if (choice == 3) {
                System.out.print("Enter title of book to delete: ");
                String delTitle = scanner.nextLine();
                boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(delTitle));
                if (removed) System.out.println("Book deleted!");
                else System.out.println("Book not found.");
            }
            else if (choice == 4) {
                System.out.println("Books in store:");
                for (Book b : books) System.out.println(b);
            }
            else if (choice == 99) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
