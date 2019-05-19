package com.company;

public class Sprawdzenie {
    public static void porownanie(char[] plansza) {

        if (plansza[0] == 'O' && plansza[1] == 'O' && plansza[2] == 'O' || //dziala poziomo
                plansza[3] == 'O' && plansza[4] == 'O' && plansza[5] == 'O' || // dziala
                plansza[6] == 'O' && plansza[7] == 'O' && plansza[8] == 'O') // dziala
        {
            System.out.println("Wygrales poziomo użytkowniku 'O'");
            System.exit(0);
        }

        if (plansza[0] == 'O' && plansza[3] == 'O' && plansza[6] == 'O' || // działa pionowo
                plansza[1] == 'O' && plansza[4] == 'O' && plansza[7] == 'O' || // działa
                plansza[2] == 'O' && plansza[5] == 'O' && plansza[8] == 'O') // działa
        {
            System.out.println("Wygrales pionowo użytkowniku 'O'");
            System.exit(0);
        }

        if (plansza[0] == 'O' && plansza[4] == 'O' && plansza[8] == 'O' || // działa po skosie
                plansza[2] == 'O' && plansza[4] == 'O' && plansza[6] == 'O') // działa
        {
            System.out.println("Wygrałeś po skosie użytkowniku 'O'");
            System.exit(0);
        }
        if (plansza[0] == 'X' && plansza[1] == 'X' && plansza[2] == 'X' || // działa poziomo
                plansza[3] == 'X' && plansza[4] == 'X' && plansza[5] == 'X' || // działa
                plansza[6] == 'X' && plansza[7] == 'X' && plansza[8] == 'X') // działa
        {
            System.out.println("Wygrales poziomo użytkowniku 'X'");
            System.exit(0);
        }
        if (plansza[0] == 'X' && plansza[3] == 'X' && plansza[6] == 'X' || // działa pionowo
                plansza[1] == 'X' && plansza[4] == 'X' && plansza[7] == 'X' || // działa
                plansza[2] == 'X' && plansza[5] == 'X' && plansza[8] == 'X') // działa
        {
            System.out.println("Wygrales pionowo użytkowniku 'X'");
            System.exit(0);
        }
        if (plansza[0] == 'X' && plansza[4] == 'X' && plansza[8] == 'X' ||  // działa
                plansza[2] == 'X' && plansza[4] == 'X' && plansza[6] == 'X') // działa
        {
            System.out.println("Wygrales po skosie użytkowniku 'X'");
            System.exit(0);
        }
    }
}
