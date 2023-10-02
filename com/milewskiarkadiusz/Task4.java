package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task4 {
    public static void main (String... args){

        int liczba1 = 8;
        int liczba2 = 5;
        boolean areEqual = liczba1 == liczba2;
        boolean isBigger = (liczba1 >= liczba2);
        boolean isDifferent = liczba1 != liczba2;
        boolean isSmaller = liczba1 < liczba2;


        System.out.println("Is liczba1 equal liczba2: " + areEqual);
        System.out.println("Is liczba1 bigger or equal than liczba2: " + isBigger);
        System.out.println("Is liczba1 different than liczba2: " + isDifferent);
        System.out.println("Is liczba1 smaller than liczba2: " + isSmaller);


    }
}
