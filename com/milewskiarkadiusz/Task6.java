package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task6 {
    public static void main (String... args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst aby poznać jego długość: ");
        String liczbaA = scanner.nextLine();
        System.out.println(liczbaA.length());
    }
}
