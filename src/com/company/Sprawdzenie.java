package com.company;

public class Sprawdzenie {
    public static void main(String[] plansza) {
        if (plansza[0] == "O" && plansza[1] == "O" && plansza[2] == "O" || // 1 poziome
                plansza[3] == "O" && plansza[4] == "O" && plansza[5] == "O" || // 2 poziome
                plansza[6] == "O" && plansza[7] == "O" && plansza[8] == "O" || // 3 poziome

                plansza[0] == "O" && plansza[3] == "O" && plansza[6] == "O" || // 1 pionowe
                plansza[1] == "O" && plansza[4] == "O" && plansza[7] == "O" || // 2 pionowe
                plansza[2] == "O" && plansza[5] == "O" && plansza[8] == "O" || // 3 pionowe

                plansza[0] == "O" && plansza[4] == "O" && plansza[8] == "O" || // 1 na skos
                plansza[2] == "O" && plansza[4] == "O" && plansza[6] == "O") {   // 2 na skos

            System.out.println("\nWYGRAŁEŚ");
        }


    }
}
