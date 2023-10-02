package com.milewskiarkadiusz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String... args) {
        System.out.println("This is FizzBuzz App. Please, choose the number to see whether is dividable by 3 or 5!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number! ");
        int liczba = scanner.nextInt();

        if ((liczba % 3 == 0) && (liczba % 5 == 0)) {
            System.out.println(" The number " + liczba + " is dividable by 3 & 5 !!!");
            System.out.println("FizzBuzz");
        } else if (liczba % 5 == 0) {
            System.out.println(" The number " + liczba + " is dividable by 5!!!");
            System.out.println("BUZZ");
        } else if (liczba % 3 == 0) {
            System.out.println(" The number " + liczba + " is dividable by 3!!!");
            System.out.println("FIZZ");
        } else {
            System.out.println(liczba);
        }
    }

}
