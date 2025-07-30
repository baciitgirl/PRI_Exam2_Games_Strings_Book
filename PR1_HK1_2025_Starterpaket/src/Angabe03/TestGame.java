package Angabe03;

import Angabe03.BatttleShipGame;

public class TestGame {

    //Diese Klasse dient nur dazu, die Klasse BattleShipGame und deren Methoden aufzurufen und zu testen

    public static void main(String[] args) {
        // A) Instanz der Klasse BattleShipGame erzeugen

        BatttleShipGame game = new BatttleShipGame();


        // B) Feld initial Zeichnen lassen

        game.displayField();

        //0. Staerke pro Player
        System.out.println("\nMethode 0:" );
        game.staerkeProSpieler();

        //1. Gesamtanzahl an Schiffen auf der Karte zuruckgeben
        System.out.println("\nMethode 1:" + game.getGesamtanzahlSchiffe());

        //2. Schiffe pro Zeile zaehlen
        System.out.println("\nMethode 2:");
        game.schiffeProZeile();

        //3. Durchschnittliche staerke der Schiffe von A
        System.out.println("\nMethode 3:" + game.durchschnittlicheStaerke() );
    }
}
