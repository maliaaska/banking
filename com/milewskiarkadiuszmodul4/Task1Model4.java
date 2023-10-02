package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task1Model4 {
    public static void main (String... args){
        System.out.println("Wprowadź liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int liczbaA = scanner.nextInt();

        if ( liczbaA < 0 ) {
            System.out.println("Liczba " + liczbaA + " jest mniejsza od zera");
        } else if (liczbaA == 0 ) {
            System.out.println("Liczba " + liczbaA + " jest równa zeru!" );
        } else {
            System.out.println("Liczba " + liczbaA + " jest większa od zera");
        }
    }

}
