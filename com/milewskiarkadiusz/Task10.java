package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("POdaj dwie liczby aby zobaczyć czy liczba1 jest podzielna przez liczbę2 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextInt();
        System.out.println(liczba1);

        System.out.println("Podaj druga liczbę ");
        double liczba2 = scanner.nextInt();
        System.out.println(liczba2);


        if (liczba1 % liczba2 == 0) {
            System.out.println("Liczba " + liczba1 + " jest podzielna przez " + liczba2 );
        } else {
            System.out.println("Liczba " + liczba1 + " nie jest podzielna przez " + liczba2);
        }
    }
}
