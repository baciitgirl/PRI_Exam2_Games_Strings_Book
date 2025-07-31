package Angabe04;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonenVerwaltung {
    private static ArrayList<Person> personenListe = new ArrayList<>();
    private static int naechsteId = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n------ Personenverwaltung ------");
            System.out.println("1. Alle Personen anzeigen");
            System.out.println("2. Person suchen");
            System.out.println("3. Neue Person hinzufügen");
            System.out.println("4. Person bearbeiten");
            System.out.println("5. Person löschen");
            System.out.println("6. Beenden");
            System.out.print("Option eingeben: ");
            option = scan.nextInt();
            scan.nextLine(); // Eingabepuffer leeren

            switch (option) {
                case 1 -> zeigeAllePersonen();
                case 2 -> suchePerson(scan);
                case 3 -> neuePerson(scan);
                case 4 -> bearbeitePerson(scan);
                case 5 -> loeschePerson(scan);
                case 6 -> System.out.println("Programm beendet.");
                default -> System.out.println("Ungültige Option.");
            }

        } while (option != 6);
        scan.close();
    }

    private static void zeigeAllePersonen() {
        if (personenListe.isEmpty()) {
            System.out.println("Keine Personen vorhanden.");
        } else {
            for (Person p : personenListe) {
                System.out.println(p);
            }
        }
    }

    private static void suchePerson(Scanner scan) {
        System.out.print("Geben Sie die ID der gesuchten Person ein: ");
        int id = scan.nextInt();
        scan.nextLine();

        for (Person p : personenListe) {
            if (p.getId() == id) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Person nicht gefunden.");
    }

    private static void neuePerson(Scanner scan) {
        System.out.print("Vorname: ");
        String vorname = scan.nextLine();
        System.out.print("Nachname: ");
        String nachname = scan.nextLine();
        System.out.print("Alter: ");
        int alter = scan.nextInt();
        scan.nextLine();
        System.out.print("E-Mail: ");
        String email = scan.nextLine();

        Person neuePerson = new Person(naechsteId++, vorname, nachname, alter, email);
        personenListe.add(neuePerson);
        System.out.println("Person hinzugefügt.");
    }

    private static void bearbeitePerson(Scanner scan) {
        System.out.print("Geben Sie die ID der zu bearbeitenden Person ein: ");
        int id = scan.nextInt();
        scan.nextLine();

        for (Person p : personenListe) {
            if (p.getId() == id) {
                System.out.print("Neuer Vorname (" + p.getVorname() + "): ");
                String vorname = scan.nextLine();
                System.out.print("Neuer Nachname (" + p.getNachname() + "): ");
                String nachname = scan.nextLine();
                System.out.print("Neues Alter (" + p.getAlter() + "): ");
                int alter = scan.nextInt();
                scan.nextLine();
                System.out.print("Neue E-Mail (" + p.getEmail() + "): ");
                String email = scan.nextLine();

                p.setVorname(vorname);
                p.setNachname(nachname);
                p.setAlter(alter);
                p.setEmail(email);

                System.out.println("Person aktualisiert.");
                return;
            }
        }
        System.out.println("Person nicht gefunden.");
    }

    private static void loeschePerson(Scanner scan) {
        System.out.print("Geben Sie die ID der zu löschenden Person ein: ");
        int id = scan.nextInt();
        scan.nextLine();

        for (Person p : personenListe) {
            if (p.getId() == id) {
                personenListe.remove(p);
                System.out.println("Person gelöscht.");
                return;
            }
        }
        System.out.println("Person nicht gefunden.");
    }
}
