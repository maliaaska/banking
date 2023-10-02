package com.milewskiarkadiuszmodul5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Modul5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz cos aby program mogł to wyświetlić od tyłu");
        String wyraz = scanner.nextLine();

        String reversed = reverseString(wyraz);

        System.out.println("Oryginalny napis: " + wyraz);
        System.out.println("Odwrócony napis: " + reversed);
    }
    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Zamiana znaków na końcach napisu
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Przesunięcie wskaźników wewnątrz napisu
            left++;
            right--;
        }

        // Konwersja char[] z powrotem na String
        return new String(characters);
    }
}
