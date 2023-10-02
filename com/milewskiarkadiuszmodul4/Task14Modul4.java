package com.milewskiarkadiuszmodul4;


/*
* Zadanie 14.
Napisz program, który poprosi użytkownika o podanie liczby całkowitej.
* Następnie program obliczy i wyświetli sumę wszystkich cyfr tej liczby, używając pętli while.
* Nie wykorzystuj metod z klasy String, używaj tylko typu int.
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class Task14Modul4 {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt(); // Napisz prosze czy liczba jest zmieniana w pamieci komputea za kazdym razem kiedy ptla przechodzi.

        // Inicjalizujemy sumę cyfr jako 0
        int sumaCyfr = 0;

        // Używamy pętli while do obliczenia sumy cyfr
        while (liczba != 0) {
            // Pobieramy cyfrę z liczby (reszta z dzielenia przez 10)
            int cyfra = liczba % 10;
            System.out.println(cyfra);
            // Dodajemy cyfrę do sumy
            sumaCyfr += cyfra;
            System.out.println("To jest pierwsza cyfra " + sumaCyfr);

            // Usuwamy ostatnią cyfrę z liczby (dzielimy przez 10)
            System.out.println("Teraz pętla while jescze raz zatacza koło i usówa ostatnią cyfre z podanej");
            liczba /= 10;

        }

        // Wyświetlamy sumę cyfr
        System.out.println("Suma cyfr podanej liczby wynosi: " + sumaCyfr);

        scanner.close();
        /*To zadanie zostalo zrobione z pomoca AI ale dodałem komentarze dla zrozumienia calego przepływu jak to wygląda.
        * Na początku chciałem podzielić ta liczbe izywajac metody natomiast nie mogłem niczego konkretnego znaleźć. Jezeli jest jakis inne rozwiązanie to chetnie
        * bym to przejżał*/
    }
}
