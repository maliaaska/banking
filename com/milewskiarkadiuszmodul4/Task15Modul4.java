package com.milewskiarkadiuszmodul4;

import java.util.Scanner;
import java.util.StringJoiner;

public class Task15Modul4 {
    public static void main (String[] args) {
/* Napisz program, który sprawdza, czy podane słowo jest palindromem (czy czyta się tak samo od przodu i od tyłu).
 Na przykład "kajak" jest palindromem.
 Nie możesz wykorzystywać metod z klasy String do odwracania napisu.
 */

//        System.out.println("Napisz wyraz aby sprawdzić czy jest palindromem: ");
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        int length = word.length();
//        for (int i = length + 1; i < length ; i--) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj słowo do sprawdzenia: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Podane słowo \"" + word + "\" jest palindromem.");
        } else {
            System.out.println("Podane słowo \"" + word + "\" nie jest palindromem.");
        }

        scanner.close();
    }

    // Metoda do sprawdzania, czy słowo jest palindromem
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase(); // Ignorujemy wielkość liter

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false; // Jeśli znaki na tych pozycjach są różne, to nie jest palindromem
            }
            start++;
            end--;
        }

        return true;
    }
    }

