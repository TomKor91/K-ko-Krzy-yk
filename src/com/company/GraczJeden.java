package com.company;

import java.util.InputMismatchException;

public class GraczJeden {
    public static void graczJeden(char[] plansza) {
//        Scanner input = new Scanner(System.in);
        boolean pomocnicza = true;
        int wybor;
        do {
            boolean test = true;
            Wyswietlenie.UzytkownikJeden();
            try {
                do {
                    wybor = IndexUzytkownika.Uzytkownik();
                    if (plansza[wybor - 1] != '*') {
                        Wyswietlenie.nieprawidlowyIndeks(wybor);
                    } else {
                        test = false;
                    }
                } while (test);
                plansza[wybor - 1] = 'O';
                for (int i = 0; i < plansza.length; i++) {
                    if (i == 2 || i == 5) {
                        System.out.print(plansza[i]);
                        System.out.println();
                        pomocnicza = false;
                    } else
                        System.out.print(plansza[i] + "  ");
                    pomocnicza = false;
                }
                Sprawdzenie.porownanie(plansza);

            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                Wyswietlenie.nieprawidlowaWartosc();
            }
        } while (pomocnicza);
    }
}

