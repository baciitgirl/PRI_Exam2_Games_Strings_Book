package Angabe02;

import java.util.Scanner;

class Book {

    private String titel, isbn, autor, veröffentlichungsdatum;
    private boolean verfuegbar;

    Book[] allBooks;

    //Konstruktor:

    public Book(String titel, String isbn, String autor, String veröffentlichungsdatum, boolean verfuegbar) {
        this.titel = titel;
        this.isbn = isbn;
        this.autor = autor;
        this.veröffentlichungsdatum = veröffentlichungsdatum;
        this.verfuegbar = verfuegbar;
    }

    //Getters und Setters


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVeröffentlichungsdatum() {
        return veröffentlichungsdatum;
    }

    public void setVeröffentlichungsdatum(String veröffentlichungsdatum) {
        this.veröffentlichungsdatum = veröffentlichungsdatum;
    }

    public boolean isVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }


    private int seitenAnzahl;
    private double buchHohe;
    private String herkunftLand;
    private String genre;
    private boolean digitalVerfuegbar;
    private float buchLaenge;
    private String buchfarbe;
    private long wortZahl;

    public int getSeitenAnzahl() {
        return seitenAnzahl;
    }

    public void setSeitenAnzahl(int seitenAnzahl) {
        this.seitenAnzahl = seitenAnzahl;
    }

    public double getBuchHohe() {
        return buchHohe;
    }

    public void setBuchHohe(double buchHohe) {
        this.buchHohe = buchHohe;
    }

    public String getHerkunftLand() {
        return herkunftLand;
    }

    public void setHerkunftLand(String herkunftLand) {
        this.herkunftLand = herkunftLand;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isDigitalVerfuegbar() {
        return digitalVerfuegbar;
    }

    public void setDigitalVerfuegbar(boolean digitalVerfuegbar) {
        this.digitalVerfuegbar = digitalVerfuegbar;
    }

    public float getBuchLaenge() {
        return buchLaenge;
    }

    public void setBuchLaenge(float buchLaenge) {
        this.buchLaenge = buchLaenge;
    }

    public String getBuchfarbe() {
        return buchfarbe;
    }

    public void setBuchfarbe(String buchfarbe) {
        this.buchfarbe = buchfarbe;
    }

    public long getWortZahl() {
        return wortZahl;
    }

    public void setWortZahl(long wortZahl) {
        this.wortZahl = wortZahl;
    }


}
