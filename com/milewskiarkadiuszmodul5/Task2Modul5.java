package com.milewskiarkadiuszmodul5;

import java.util.Scanner;

public class Task2Modul5 {
    public static void main(String... args) {
        System.out.println("Wpisz rok, żeby zobaczyc czy jest przestępny!!!");
        countLeapYear();

    }

    public static boolean countLeapYear() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 != 0) {
            System.out.println("the year " + year + " is not leap");
            return false;

        } else {
            System.out.println("the year " + year + " is leap");
            return true;
        }
    }
}
