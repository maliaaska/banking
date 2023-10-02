package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task3 {
    public static void main (String... args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int liczbaA = scanner.nextInt();
        System.out.println(liczbaA);

        System.out.println("Podaj druga liczbę ");
        int liczbaB = scanner.nextInt();
        System.out.println(liczbaB);

        System.out.println("podaj trzecią liczbę: ");
        int liczbaC = scanner.nextInt();
        System.out.println(liczbaC);

        double suma = liczbaA + liczbaB + liczbaC;
        System.out.println("Suma tych liczb to: " + suma);
        System.out.print("Natomiast ich średnia arytmetyczna to: " + suma / 3);
    }

}
