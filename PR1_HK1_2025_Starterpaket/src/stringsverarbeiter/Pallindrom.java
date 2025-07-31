package stringsverarbeiter;

import java.util.Scanner;

public class Pallindrom {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Eingabeaufforderung
            System.out.println("Geben Sie das Wort oder den Satz ein:");

            // Eingabe wird vollständig eingelesen und in Kleinbuchstaben umgewandelt
            String satz = scanner.nextLine().toLowerCase();

            // Entfernen von Satzzeichen (Punkt, Doppelpunkt, Ausrufezeichen, Semikolon)
            // Hinweis: Der aktuelle Code macht das in jeder Schleifeniteration neu – ineffizient.
            // Besser mit replaceAll und regulärem Ausdruck:
            satz = satz.replaceAll("[\\.:!;]", ""); // entfernt diese Satzzeichen

            // Entferne alle Leerzeichen (auch doppelte)
            satz = satz.replaceAll("\\s+", "");

            // Erzeuge eine umgekehrte Version des bereinigten Satzes
            StringBuilder strb = new StringBuilder(satz);
            String satz1 = strb.reverse().toString();

            // Debug-Ausgabe: zeigt Original (bereinigt) und umgedreht
            System.out.println("Original bereinigt: " + satz);
            System.out.println("Umgekehrt: " + satz1);

            // Vergleich: ist der Satz gleich seiner Umkehrung?
            if (satz.equals(satz1)) {
                System.out.println("Dieser Satz ist ein Palindrom: " + satz1);
            } else {
                System.out.println("Dieser Satz ist kein Palindrom.");
            }

            scanner.close(); // Scanner schließen (gute Praxis)
        }

}
