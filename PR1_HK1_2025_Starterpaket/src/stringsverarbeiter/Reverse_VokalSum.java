package stringsverarbeiter;

import java.util.Scanner;

public class Reverse_VokalSum {
    public static void main(String[] args) {
        Reverse_VokalSumme_Int_Fakultaet.programmAuswahlMenue();
    }

    public class Reverse_VokalSumme_Int_Fakultaet {
        public static void programmAuswahlMenue() {

            int option = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPlease select an option by entering the number of the option\n\n1." +
                    " Reversed string output\n2. Check if a number is even or odd\n3. Count the vowels\n4. Calculate the factorial");
            option = scanner.nextInt();



            switch (option) {
                case 1:
                    System.out.println("Please enter a string");
                    String line = scanner.next();
                    StringBuilder strb = new StringBuilder(line);
                    line = strb.reverse().toString();
                    System.out.println(line);
                    break;

                case 2:
                    System.out.println("Please Enter an integer");
                    int number = scanner.nextInt();

                    if (number % 2 == 0) {
                        System.out.println("This integer is even");
                    } else
                        System.out.println("This integer is odd");
                    break;

                case 3:
                    int sum = 0;
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Please enter a sentence");

                    String sentence = scan.nextLine();
                    scanner.close();
                    sentence = sentence.toLowerCase();

                    for (int i = 0; i <= sentence.length()-1; i++) {
                        char character = sentence.charAt(i);
                        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

                            sum++;
                        }
                    }
                    System.out.println("The String has " + sum + " vowels");

                    break;

                case 4:
                    int product = 1;
                    System.out.println("Please enter an integer");
                    int num = scanner.nextInt();

                    while (num > 0){
                        product = product * num;
                        num--;
                    }
                    System.out.println("The factorial is: " + product);

                    break;
            }


        }
    }

}
