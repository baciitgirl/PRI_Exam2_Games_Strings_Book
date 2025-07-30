package Angabe03;

    public class BatttleShipGame {

        // 2D-Feld mit Schiffen (1-4), Wasser (0) und getroffenen Schiffen (negativ)
        int[][] map = {
                {1, 0, 0, 2, 0, 0, 1, 1, 0, 0},
                {3, 0, -1, 0, 0, 0, 2, 0, -1, 0},
                {0, 3, 0, 0, -1, 0, 0, 2, 0, 0},
                {0, 0, 0, 4, 4, 0, 1, 0, 0, 2},
                {0, -3, 2, 0, 0, 0, -1, 0, 0, 0},
                {0, 0, -2, 0, 0, -4, 0, 0, -1, 0},
                {0, 0, 0, 0, -3, 0, 0, 0, 0, 0},
                {0, 0, -2, 0, -2, 0, 0, -2, 0, 0}
        };

        // Gibt das gesamte Spielfeld aus
        public void displayField() {
            for (int[] zeile : map) {
                for (int wert : zeile) {
                    if (wert >= 0) {
                        System.out.print(wert + "   ");
                    } else {
                        System.out.print(wert + "  ");
                    }
                }
                System.out.println();
            }
        }

        // Zählt die Anzahl aller Schiffe auf dem Spielfeld
        public int getGesamtanzahlSchiffe() {
            int count = 0;
            for (int[] zeile : map) {
                for (int zelle : zeile) {
                    if (zelle > 0) count++;
                }
            }
            return count;
        }

        // Gibt die Anzahl an Schiffsteilen pro Zeile aus
        public void schiffeProZeile() {
            for (int i = 0; i < map.length; i++) {
                int count = 0;
                for (int zelle : map[i]) {
                    if (zelle > 0) count++;
                }
                System.out.println("Zeile " + i + ": " + count + " Schiffe");
            }
        }

        // Gibt durchschnittliche Stärke aller positiven Schiffswerte zurück
        public double durchschnittlicheStaerke() {
            int sum = 0;
            int count = 0;
            for (int[] zeile : map) {
                for (int zelle : zeile) {
                    if (zelle > 0) {
                        sum += zelle;
                        count++;
                    }
                }
            }
            return count == 0 ? 0 : (double) sum / count;
        }

        // Bonus: Stärke pro Spieler berechnen (z.B. alle 1er, 2er etc.)
        public void staerkeProSpieler() {
            int[] staerken = new int[5]; // 1–4 erlaubt
            for (int[] zeile : map) {
                for (int zelle : zeile) {
                    if (zelle > 0 && zelle <= 4) {
                        staerken[zelle]++;
                    }
                }
            }
            for (int i = 1; i <= 4; i++) {
                System.out.println("Spieler " + i + " hat " + staerken[i] + " Schiffsteile.");
            }
        }





    }


