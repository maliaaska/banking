package com.milewskiarkadiuszmodul4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2Modul4 {
    public static void main (String... args){
    /* Zadanie 2.
Utwórz tablicę typu int. Uzupełnij ją wartościami za pomocą pętli for.
A następnie wydrukuj jej zawartość na ekranie za pomocą pętli zakresowej for-each.*/
        int [] liczby = {0,0,0,0,0};
        for ( int i = 0; i < 5 ; i++ ) {
            liczby[i] = i;

        }
        for ( int liczba : liczby ) {
            System.out.println((liczba));
        }
    }
}
