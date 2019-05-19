package com.company;

public class Kolko_krzyzyk {
    public static void main(String[] args) {

        Wyswietlenie.powitanie();
        char[] plansza = Plansza.plansza();

        for (int i = 0; i < 5; i++) {
            GraczJeden.graczJeden(plansza);
            if (i < 4) {
                GraczDwa.graczDwa(plansza);
            }
        }
    }
}

