package com.company;

public class Wyswietlenie {
    public static void powitanie(){
        System.out.println("Gra Kółko Krzyżyk\n");
    }
    public static void UzytkownikJeden(){
        System.out.println("\n\nGraczu 1 ' O ' podaj miejsce od 1 do 9");
    }
    public static void UzytkownikDwa(){
        System.out.println("\n\nGraczu 2 ' X ' podaj miejsce od 1 do 9");
    }
    public static void nieprawidlowyIndeks(int wybor){
        System.out.println("Indeks " + wybor + " jest zajęty ** Spróbuj ponownie **");
    }
    public static void nieprawidlowaWartosc(){
        System.out.println("Nieprawidłowa wartość");
    }
}
