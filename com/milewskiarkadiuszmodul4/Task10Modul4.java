package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task10Modul4 {
    public static void main (String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Podaj trzy długosci aby zobaczyc czy uda sie z nich zbudowac trójkąt./ Pamiętaj, aby dlugosć 'c' była najdłuższym bokiem w przeciwnym razie wysta błąd!!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą długość:");
        a = scanner.nextInt();
        System.out.println("Podaj drugą długość:");
        b = scanner.nextInt();
        System.out.println("Podaj trzecią długość:");
        c = scanner.nextInt();

        if ( c < a || c < b ) {
            System.out.println("Długość 'c' nie jest najdłuższą z podanych!!! Zacznij od nowa");
        } else if ( a + b > c ) {
            System.out.println("Z tych boków da się zbudować trójkąt!");
        } else {
            System.out.println("Z tych boków nie da sie zbudowac trójkąt!");
        }
    }
}
