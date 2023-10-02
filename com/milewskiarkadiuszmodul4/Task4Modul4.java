package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task4Modul4 {
    public static void main (String... args) {
        System.out.println("Type integer to check if the number is even or odd");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ( number % 2 == 0 ){
            System.out.println("The number " + number + " is even." );
        } else {
            System.out.println("The number " + number + " is odd." );
        }
    }
}
