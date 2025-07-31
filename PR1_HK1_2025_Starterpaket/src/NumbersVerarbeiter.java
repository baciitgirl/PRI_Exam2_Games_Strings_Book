
import java.util.Scanner;

    public class NumbersVerarbeiter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int option;

            do {
                System.out.println("\n-------- Zahlen Verarbeiter --------");
                System.out.println("1. Summe und Durchschnitt berechnen");
                System.out.println("2. Größte und kleinste Zahl finden");
                System.out.println("3. Ist eine Zahl eine Primzahl?");
                System.out.println("4. Quersumme einer Zahl berechnen");
                System.out.println("5. Gerade und ungerade Zahlen zählen");
                System.out.println("6. Beenden");
                System.out.print("Wählen Sie eine Option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        int[] zahlen = liesZahlenArray(scanner);
                        berechneSummeUndDurchschnitt(zahlen);
                    }
                    case 2 -> {
                        int[] zahlen = liesZahlenArray(scanner);
                        findeMinMax(zahlen);
                    }
                    case 3 -> {
                        System.out.print("Geben Sie eine Zahl ein: ");
                        int zahl = scanner.nextInt();
                        boolean istPrim = istPrimzahl(zahl);
                        System.out.println(zahl + (istPrim ? " ist eine Primzahl." : " ist keine Primzahl."));
                    }
                    case 4 -> {
                        System.out.print("Geben Sie eine Zahl ein: ");
                        int zahl = scanner.nextInt();
                        int qs = berechneQuersumme(zahl);
                        System.out.println("Quersumme: " + qs);
                    }
                    case 5 -> {
                        int[] zahlen = liesZahlenArray(scanner);
                        zaehleGeradeUngerade(zahlen);
                    }
                    case 6 -> System.out.println("Programm wird beendet.");
                    default -> System.out.println("Ungültige Option.");
                }

            } while (option != 6);

            scanner.close();
        }

        // Methode 1: Summe & Durchschnitt
        public static void berechneSummeUndDurchschnitt(int[] zahlen) {
            int summe = 0;
            for (int zahl : zahlen) {
                summe += zahl;
            }
            double durchschnitt = (double) summe / zahlen.length;
            System.out.println("Summe: " + summe);
            System.out.println("Durchschnitt: " + durchschnitt);
        }

        // Methode 2: Min & Max
        public static void findeMinMax(int[] zahlen) {
            int min = zahlen[0];
            int max = zahlen[0];

            for (int zahl : zahlen) {
                if (zahl < min) min = zahl;
                if (zahl > max) max = zahl;
            }

            System.out.println("Kleinste Zahl: " + min);
            System.out.println("Größte Zahl: " + max);
        }

        // Methode 3: Primzahlprüfung
        public static boolean istPrimzahl(int zahl) {
            if (zahl < 2) return false;
            for (int i = 2; i <= Math.sqrt(zahl); i++) {
                if (zahl % i == 0) return false;
            }
            return true;
        }

        // Methode 4: Quersumme
        public static int berechneQuersumme(int zahl) {
            int summe = 0;
            while (zahl != 0) {
                summe += zahl % 10;
                zahl /= 10;
            }
            return summe;
        }

        // Methode 5: Gerade & ungerade zählen
        public static void zaehleGeradeUngerade(int[] zahlen) {
            int gerade = 0;
            int ungerade = 0;

            for (int zahl : zahlen) {
                if (zahl % 2 == 0) {
                    gerade++;
                } else {
                    ungerade++;
                }
            }

            System.out.println("Anzahl gerader Zahlen: " + gerade);
            System.out.println("Anzahl ungerader Zahlen: " + ungerade);
        }

        // Hilfsmethode: Zahlen-Array von Benutzer einlesen
        public static int[] liesZahlenArray(Scanner scanner) {
            System.out.print("Wie viele Zahlen möchten Sie eingeben? ");
            int anzahl = scanner.nextInt();
            int[] zahlen = new int[anzahl];

            for (int i = 0; i < anzahl; i++) {
                System.out.print("Zahl " + (i + 1) + ": ");
                zahlen[i] = scanner.nextInt();
            }

            return zahlen;
        }
    }

