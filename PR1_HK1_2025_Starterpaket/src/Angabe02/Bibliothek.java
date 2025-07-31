package Angabe02;

import java.util.Scanner;

public class Bibliothek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Bücher initialisieren
        Book[] allBooks = new Book[3];
        allBooks[0] = new Book("The Great Gatsby", "9780743273565", "F. Scott Fitzgerald", "1925-04-10", true);
        allBooks[1] = new Book("To Kill a Mockingbird", "9780446310789", "Harper Lee", "1960-07-11", true);
        allBooks[2] = new Book("Pride and Prejudice", "9780141439518", "Jane Austen", "1813-01-28", true);

        int option;
        do {
            // Menü anzeigen
            System.out.println("------------------------------");
            System.out.println("Library Management System");
            System.out.println("1. View all books");
            System.out.println("2. Search for a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            option = scan.nextInt();
            scan.nextLine(); // Eingabepuffer leeren

            switch (option) {
                case 1:
                    viewBooks(allBooks);
                    break;
                case 2:
                    searchBook(allBooks, scan);
                    break;
                case 3:
                    borrowBook(allBooks, scan);
                    break;
                case 4:
                    returnBook(allBooks, scan);
                    break;
                case 5:
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Option.");
            }
        } while (option != 5);

        scan.close();
    }

    // 1. Alle Bücher anzeigen
    public static void viewBooks(Book[] allBooks) {
        System.out.printf("%-25s %-20s %-15s %-15s %-12s%n",
                "Title", "Author", "ISBN", "Publication Date", "Availability");
        for (Book b : allBooks) {
            System.out.printf("%-25s %-20s %-15s %-15s %-12s%n",
                    b.getTitel(),
                    b.getAutor(),
                    b.getIsbn(),
                    b.getVeröffentlichungsdatum(),
                    b.isVerfuegbar() ? "Available" : "Not available");
        }
        System.out.println();
    }

    // 2. Buch suchen
    public static void searchBook(Book[] allBooks, Scanner scan) {
        System.out.print("Enter ISBN: ");
        String input = scan.nextLine();
        boolean found = false;

        for (Book b : allBooks) {
            if (b.getIsbn().equals(input)) {
                System.out.println("Title: " + b.getTitel());
                System.out.println("Author: " + b.getAutor());
                System.out.println("ISBN: " + b.getIsbn());
                System.out.println("Publication Date: " + b.getVeröffentlichungsdatum());
                System.out.println("Availability: " + (b.isVerfuegbar() ? "Available" : "Not available"));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }

        System.out.println();
    }

    // 3. Buch ausleihen
    public static void borrowBook(Book[] allBooks, Scanner scan) {
        System.out.print("Enter ISBN: ");
        String input = scan.nextLine();
        boolean found = false;

        for (Book b : allBooks) {
            if (b.getIsbn().equals(input)) {
                found = true;
                if (b.isVerfuegbar()) {
                    b.setVerfuegbar(false);
                    System.out.println("Book borrowed successfully");
                } else {
                    System.out.println("Book not found or available");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found or available");
        }

        System.out.println();
    }

    // 4. Buch zurückgeben
    public static void returnBook(Book[] allBooks, Scanner scan) {
        System.out.print("Enter ISBN: ");
        String input = scan.nextLine();
        boolean found = false;

        for (Book b : allBooks) {
            if (b.getIsbn().equals(input)) {
                found = true;
                if (!b.isVerfuegbar()) {
                    b.setVerfuegbar(true);
                    System.out.println("Book returned successfully");
                } else {
                    System.out.println("Book not found or already available");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found or already available");
        }

        System.out.println();
    }
}
