package lab1.pojos;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void run() {
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

            public int getIsbn() {
                return isbn;
            }

            public void setIsbn(int isbn) {
                this.isbn = isbn;
            }

            public int getPageNumber() {
                return pageNumber;
            }

            public void setPageNumber(int pageNumber) {
                this.pageNumber = pageNumber;
            }

            @Override
            public String toString() {
                return title + " by " + author + " (ISBN: " + isbn + ", Pages: " + pageNumber + ")";
            }
        }

        class Bookstore {
            void start() {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Book> books = new ArrayList<>();
                int choice;

                do {
                    System.out.println("***********************");
                    System.out.println("1. Add Items ");
                    System.out.println("2. Edit Items ");
                    System.out.println("3. Delete Items");
                    System.out.println("4. Sell item(s)");
                    System.out.println("5. List items");
                    System.out.println("99. Quit");
                    System.out.println("***********************");

                    System.out.print("Enter choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();


                    switch (choice) {
                        case 1:
                            System.out.print("Enter title: ");
                            String title = scanner.nextLine();
                            System.out.print("Enter author: ");
                            String author = scanner.nextLine();
                            System.out.print("Enter ISBN: ");
                            int isbn = scanner.nextInt();
                            System.out.print("Enter page count: ");
                            int pages = scanner.nextInt();
                            scanner.nextLine();

                            books.add(new Book(title, author, isbn, pages));
                            System.out.println("Book added!\n");
                            break;

                        case 5:
                            System.out.println("Listing items:");
                            for (Book b : books) {
                                System.out.println(b);
                            }
                            System.out.println();
                            break;

                        case 99:
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Invalid option.\n");
                            break;
                    }
                } while (choice != 99);
            }
        }
    }
}
