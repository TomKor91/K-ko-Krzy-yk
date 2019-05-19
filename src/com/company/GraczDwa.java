package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GraczDwa {
    public static void graczDwa(char[] plansza) {
        Scanner input = new Scanner(System.in);
        boolean pomocnicza = true;
        int wybor;
        do {
            Wyswietlenie.UzytkownikDwa();
            boolean test = true;
            try {
                do {
                    wybor = IndexUzytkownika.Uzytkownik();
                    if (plansza[wybor - 1] != '*') {
                        Wyswietlenie.nieprawidlowyIndeks(wybor);
                    } else {
                        test = false;
                    }
                } while (test);
                plansza[wybor - 1] = 'X';
                for (int i = 0; i < plansza.length; i++) {
                    if (i == 2 || i == 5) {
                        System.out.print(plansza[i]);
                        System.out.println();
                        pomocnicza = false;
                    } else
                        System.out.print(plansza[i] + "  ");
                    pomocnicza = false;
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                Wyswietlenie.nieprawidlowaWartosc();;
            }
        } while (pomocnicza);
    }
}

