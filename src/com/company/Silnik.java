package com.company;

import java.util.Scanner;

public class Silnik {
    public static void main() {
        String[] plansza = {"*  ", "*  ", "*  \n", "*  ", "*  ", "*  \n", "*  ", "*  ", "*"};
        for (int i = 0; i < plansza.length; i++) {
            if (i == 2 || i == 5) {
                System.out.print(plansza[i]);
                System.out.println();
            } else
                System.out.print(plansza[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            wyborGraczaJeden(plansza);// wywołanie metody
            wyborGraczaDwa(plansza); // wywołanie metody
            if (i >= 3) {
                Sprawdzenie.main(plansza);
            }
            }
        }

        public static String[] wyborGraczaJeden (String[]plansza1){ // moja metoda
            System.out.println("\n\nGraczu 1 'Kółko' podaj miejsce od 1 do 9");
            Scanner input = new Scanner(System.in);
            int wybor = input.nextInt();
            plansza1[wybor - 1] = "O  ";
            for (int i = 0; i < plansza1.length; i++) {
                if (i == 2 || i == 5) {
                    System.out.print(plansza1[i]);
                    System.out.println("\n");

                } else
                    System.out.print(plansza1[i] + "  ");
            }
            return plansza1;
        }

        public static String[] wyborGraczaDwa (String[]plansza1){ // Metoda
            System.out.println("\n\nGraczu 2 'Krzyżyk' podaj miejsce od 1 do 9");
            Scanner input = new Scanner(System.in);
            int wybor = input.nextInt();
            plansza1[wybor - 1] = "X  ";
            for (int i = 0; i < plansza1.length; i++) {
                if (i == 2 || i == 5) {
                    System.out.print(plansza1[i]);
                    System.out.println();
                    System.out.println();

                } else
                    System.out.print(plansza1[i] + "  ");
            }
            return plansza1;
        }
    }



