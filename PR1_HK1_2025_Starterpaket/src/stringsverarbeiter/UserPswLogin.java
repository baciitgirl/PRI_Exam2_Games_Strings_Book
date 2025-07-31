package stringsverarbeiter;

import java.util.Scanner;

public class UserPswLogin {



        // Statische Methode zur Login-Simulation
        public static void main(String[] args) {
            String loginName = "";    // Benutzername (wird vom Nutzer eingegeben)
            String loginPw = "";      // Passwort (wird vom Nutzer eingegeben)
            int i = 1;                // Versuchszähler
            Scanner scanner = new Scanner(System.in); // Scanner für Eingaben

            // Erste Eingabeaufforderung
            System.out.println("Please enter the username");
            loginName = scanner.next();

            System.out.println("Please enter the password");
            loginPw = scanner.next();

            // Schleife für Login-Versuche (max. 3 Versuche)
            while ((!loginName.equals("user123") || !loginPw.equals("password123")) && i < 3) {
                System.out.println("Username or Password is not correct. Please try again.");
                System.out.println("You have " + (3 - i) + " tries left.");

                // Neue Eingabe
                System.out.println("Please enter the username");
                loginName = scanner.next();

                System.out.println("Please enter the password");
                loginPw = scanner.next();

                i++;
            }

            // Nach dem letzten Versuch (egal ob erfolgreich oder nicht)
            if (loginName.equals("user123") && loginPw.equals("password123")) {
                System.out.println("Well done!\nChoose a better password!");
            } else {
                System.out.println("Destruct sequence initiated!   RUN!");
            }

            scanner.close(); // Scanner ordentlich schließen
        }


}
