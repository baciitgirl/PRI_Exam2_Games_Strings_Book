package Angabe01;

import java.util.Scanner;

public class StringVerarbeiter {
    public static void main(String[] args) {
        //Das schaffen Sie !!!

        Scanner scanner = new Scanner(System.in);
        //Methode, um die Länge eines Strings auszugeben:
        System.out.println("Geben sie ein Wort ein: ");
        String input = scanner.nextLine();
        System.out.println("Methode LieferLaenge: " + lieferLaenge(input));


        //Methode, um ein Zeichen auf der Stelle "zahl" aus einer String auszugeben:
        System.out.println("Geben sie ein Wort ein: ");
        String input2 = scanner.nextLine();
        System.out.println("Geben sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        System.out.println("Methode LieferZeichen: " + liefereZeichen(input2, zahl) );



        //Methode, um ein modifizierter String auszugeben:

        System.out.println("Geben sie ein Wort ein: ");
        String input3 = scanner.nextLine();
        System.out.println("Geben sie ein Zeichen aus dem Wort ein: ");
        char alt = scanner.next().charAt(0);
        System.out.println("Geben sie ein gewunschtes Zeichen ein: ");
        char neu = scanner.next().charAt(0);
        System.out.println("Methode LieferZeichen: " + ersetzeAlle(input3,alt,neu));


        //Methode, um 2 Strings zu vergleichen:
        System.out.println("Geben sie ein Wort ein: ");
        String wort1 = scanner.nextLine();
        System.out.println("Geben sie ein Wort ein: ");
        String wort2 = scanner.nextLine();
        System.out.println("Methode StringVergleicher: " + stringVergleicher(wort1, wort2));


    }

    //Hier kommen Ihre geforderten Methoden aus Aufgabe 1

//Länge bestimmen:
    public static int lieferLaenge(String wort) {

        if (wort.length() == 0) {
            System.out.println("Eingabe ist leer");
            return 0;

        } else {
            int resultLenght = wort.length();
            System.out.println(resultLenght);
            return resultLenght;
        }
    }

    //ein Zeichen auszugeben:

    public static int liefereZeichen(String wort, int zahl) {

        char[] charArray = wort.toCharArray();
        int zahl1 = zahl;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == zahl) {
                zahl1= charArray[i];

            }
        }

        return zahl1;

    }

    //alle Zeichen ersetzen

    public static String ersetzeAlle(String wort, char alt, char neu){
        char[] charArray = wort.toCharArray();
        String neuWort="";
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == alt) {
                    charArray[i] =neu;

                }
                neuWort = String.copyValueOf(charArray);
                System.out.println(neuWort);
                return neuWort;

            }
        return neuWort;

    }

//Methode, um 2 Strings zu vergleichen:
    public static boolean stringVergleicher(String wort1, String wort2){

        if(wort1.equals(wort2)){
            return true;

        }

        return false;
    }
}

//Hier kommt nix hin, das ist ja außerhalb der Klasse, waere nicht gut!