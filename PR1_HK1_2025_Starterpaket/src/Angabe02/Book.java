package Angabe02;
import java.util.Scanner;
public class Book {
    private String titel, isbn, autor, veröffentlichungsdatum;
    private boolean verfuegbar;

    public Book(String titel, String isbn, String autor, String veröffentlichungsdatum, boolean verfuegbar) {
        this.titel = titel;
        this.isbn = isbn;
        this.autor = autor;
        this.veröffentlichungsdatum = veröffentlichungsdatum;
        this.verfuegbar = verfuegbar;
    }

    public String getTitel() {
        return titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getVeröffentlichungsdatum() {
        return veröffentlichungsdatum;
    }

    public boolean isVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
}

