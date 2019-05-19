package com.company;

public class Plansza {
    static char[] plansza() {

        char[] plansza = {'*', '*', '*', '*', '*', '*', '*', '*', '*'};
        for (int i = 0; i < plansza.length; i++) {
            if (i == 2 || i == 5) {
                System.out.print(plansza[i]);
                System.out.println();
            } else
                System.out.print(plansza[i] + "  ");
        }return plansza;
    }
}




