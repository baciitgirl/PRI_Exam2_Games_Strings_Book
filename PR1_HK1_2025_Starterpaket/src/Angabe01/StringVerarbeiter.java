package Angabe01;

import java.util.Scanner;

public class StringVerarbeiter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n-------------------------------");
            System.out.println("String Verarbeiter - Menü");
            System.out.println("1. Länge eines Strings ermitteln");
            System.out.println("2. Zeichen an bestimmter Stelle liefern");
            System.out.println("3. Alle Zeichen ersetzen");
            System.out.println("4. Zwei Strings vergleichen");
            System.out.println("5. Beenden");
            System.out.print("Option wählen: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Eingabepuffer leeren

            switch (option) {
                case 1 -> {
                    System.out.print("Geben Sie ein Wort ein: ");
                    String input = scanner.nextLine();
                    System.out.println("Länge: " + lieferLaenge(input));
                }
                case 2 -> {
                    System.out.print("Geben Sie ein Wort ein: ");
                    String input = scanner.nextLine();
                    System.out.print("Geben Sie die Position (Index) ein: ");
                    int zahl = scanner.nextInt();
                    scanner.nextLine();
                    char result = liefereZeichen(input, zahl);
                    System.out.println("Zeichen an Position " + zahl + ": " + result);
                }
                case 3 -> {
                    System.out.print("Geben Sie ein Wort ein: ");
                    String input = scanner.nextLine();
                    System.out.print("Geben Sie ein zu ersetzendes Zeichen ein: ");
                    char alt = scanner.next().charAt(0);
                    System.out.print("Geben Sie das neue Zeichen ein: ");
                    char neu = scanner.next().charAt(0);
                    scanner.nextLine(); // Puffer leeren
                    String result = ersetzeAlle(input, alt, neu);
                    System.out.println("Ergebnis: " + result);
                }
                case 4 -> {
                    System.out.print("Geben Sie das erste Wort ein: ");
                    String wort1 = scanner.nextLine();
                    System.out.print("Geben Sie das zweite Wort ein: ");
                    String wort2 = scanner.nextLine();
                    boolean gleich = stringVergleicher(wort1, wort2);
                    if (gleich) {
                        System.out.println("Die Strings sind gleich.");
                    } else {
                        System.out.println("Die Strings sind unterschiedlich.");
                    }
                }
                case 5 -> System.out.println("Programm beendet.");
                default -> System.out.println("Ungültige Option. Bitte erneut versuchen.");
            }

        } while (option != 5);

        scanner.close();
    }

    // Methode: Länge eines Strings zurückgeben
    public static int lieferLaenge(String wort) {
        return wort.length();
    }

    // Methode: Zeichen an bestimmter Stelle liefern
    public static char liefereZeichen(String wort, int zahl) {
        if (zahl < 0 || zahl >= wort.length()) {
            System.out.println("Index außerhalb des Bereichs!");
            return '?';
        }
        return wort.charAt(zahl);
    }

    // Methode: Alle Vorkommen eines Zeichens ersetzen
    public static String ersetzeAlle(String wort, char alt, char neu) {
        char[] charArray = wort.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == alt) {
                charArray[i] = neu;
            }
        }
        return new String(charArray);
    }

    // Methode: Zwei Strings vergleichen
    public static boolean stringVergleicher(String wort1, String wort2) {
        return wort1.equals(wort2);
    }
}
