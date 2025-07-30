package Angabe02;

import java.util.Scanner;

public class Bibliothek {
    public static void main(String[] args) {

        /*
        //Falls aus Datenbank die Daten kommen:
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie gross ist die Bibliothek?: ") ;
        int size = scan.nextInt();
        Book[] allBooks = new Book[size];
        */

        //Ein Array mit Bücher erstellen:
        Book[] allBooks = new Book[5];

        allBooks[0] = new Book("book1", "123", "King", "23.05.2025", true );
        allBooks[1] = new Book("book2", "456", "Peterson", "03.05.2023", true );
        allBooks[2] = new Book("book3", "789", "Larson", "20.08.1998", true );
        allBooks[3] = new Book("book4", "987", "Edisson", "23.01.1960", true );
        allBooks[4] = new Book("book5", "654", "Hueber", "14.05.1987", true );

        //Check, on Array existiert:
        /*Nur zum Testzweck
        for (Book b : allBooks){
            System.out.println(b.getTitel());
        }
        */

        //Alle Bücher auflisten:
        viewBooks(allBooks);
        //Ein Buch suchen:
        searchBook(allBooks);

        //Ein Buch ausleihen:
        borrowBook(allBooks);
        // Ein Buch zurückgeben:
        returnBook(allBooks);

    }


    //Alle Bücher ausgeben:
    public static void viewBooks(Book [] allBooks) {
        System.out.println("Title" + "  " + "Author" + "        " + "ISBN" + "  " + "Publication Date" + "  " +  "Availability");

        for (int i = 0; i < allBooks.length; i++) {
            System.out.printf(allBooks[i].getTitel() +  "        ");
            System.out.printf(allBooks[i].getAutor() +  "      ");
            System.out.printf(allBooks[i].getIsbn() + "   ");
            System.out.printf(allBooks[i].getVeröffentlichungsdatum() + "   ");
            System.out.printf(allBooks[i].isVerfuegbar() +  "    " + "\n");

        }


    }

    //Ein Buch suchen:

    public static  void searchBook(Book [] allBooks) {

        System.out.println("Geben Sie bitte eine ISBN ein");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i].getIsbn().equals(input)) {
                System.out.println("Titel:" + allBooks[i].getTitel());
                System.out.println("Author:" + allBooks[i].getAutor());
                System.out.println("ISBN:" + allBooks[i].getIsbn());
                System.out.println("Publication Date: " + allBooks[i].getVeröffentlichungsdatum());
                System.out.println("Availability:" + allBooks[i].isVerfuegbar());

            }
            //System.out.println("Book not found");
        }

    }

    //Ein Buch ausleihen (falls ist es in der Bibliothek im Moment:

    public static void borrowBook(Book [] allBooks) {
        int counter = 0;
        System.out.println("Geben Sie bitte eine ISBN ein");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i].getIsbn().equals(input)) {

                if(allBooks[i].isVerfuegbar()){
                    counter++;
                    allBooks[i].setVerfuegbar(false);
                }
                System.out.println("Book borrowed successfully");
                return;
            }
        }
        //System.out.println("Book not found or available");


    }

    public static void returnBook(Book [] allBooks) {
        System.out.println("Geben Sie bitte eine ISBN ein");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i].getIsbn().equals(input)) {

                if(!allBooks[i].isVerfuegbar()){
                    allBooks[i].setVerfuegbar(true);
                }
                System.out.println("Book returned successfully");
                return;
            }


        }
        //System.out.println("Book not found");


    }
}

