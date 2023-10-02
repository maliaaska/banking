package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task2 {

    public static void main (String... args){
        int liczba1 = 10;
        int liczba2 = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dodaj coś do liczba1: ");
        int liczbaA = scanner.nextInt() + liczba1;
        System.out.println(liczbaA);

        System.out.println("Dodaj coś do liczba2  ");
        int liczbaB = scanner.nextInt() + liczba2;
        System.out.println(liczbaB);

    }
}
