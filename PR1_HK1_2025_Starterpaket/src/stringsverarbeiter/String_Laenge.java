package stringsverarbeiter;

import java.util.Scanner;

public class String_Laenge {
    // Hauptmethode: Wird beim Programmstart zuerst ausgeführt
    public static void main(String[] args) {
        // Ruft Methode auf, die die Länge des Wortes "hallo" ausgibt
        liefereLaenge("hallo");

        // Ruft Methode auf, die das 3. Zeichen des Wortes "hallo" ausgibt
        liefereZeichen("hallo", 3);

        // Ruft Methode auf, die im Wort "hallo" alle 'l' durch 'x' ersetzt
        ersetzeAlle("hallo", 'l', 'x');

        // Startet Methode, die zwei Wörter vom Benutzer einliest und vergleicht
        stringVergleicher();
    }

    // Gibt die Länge eines Strings aus
    public static void liefereLaenge(String wort) {
        System.out.println("Methode liefereLaenge: " + wort.length());
        // Beispiel: "hallo" hat Länge 5
    }

    // Gibt ein bestimmtes Zeichen an einer Position im Wort aus
    public static void liefereZeichen(String wort, int zahl) {
        // Achtung: Strings sind nullbasiert (Index startet bei 0),
        // daher wird (zahl - 1) verwendet
        char charPlace = wort.charAt(zahl - 1);
        System.out.println("Methode liefereZeichen: " + charPlace);
        // Beispiel: "hallo", 3 → 'l' (Index 2)
    }

    // Ersetzt alle Vorkommen eines Zeichens im Wort durch ein anderes Zeichen
    public static void ersetzeAlle(String wort, char alt, char neu) {
        // Achtung: replace ersetzt alle Vorkommen, also reicht ein Aufruf
        wort = wort.replace(alt, neu);
        System.out.println("Methode ersetzeAlle: " + wort);
        // Beispiel: "hallo", 'l' → 'x' → "haxxo"
    }

    // Vergleicht zwei Benutzereingaben unabhängig von Groß-/Kleinschreibung
    public static boolean stringVergleicher() {
        boolean wortegleich = false;

        // Scanner für Benutzereingaben
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib das erste Wort ein");
        String wort1 = sc.next(); // Liest erstes Wort

        System.out.println("Gib das zweite Wort ein");
        String wort2 = sc.next(); // Liest zweites Wort

        // Vergleich der Wörter – Groß-/Kleinschreibung wird ignoriert
        if (wort1.equalsIgnoreCase(wort2)) {
            wortegleich = true;
        } else {
            wortegleich = false;
        }

        // Ausgabe des Vergleichs
        System.out.println("Methode stringVergleicher: " + wortegleich);
        return wortegleich;
    }
}
