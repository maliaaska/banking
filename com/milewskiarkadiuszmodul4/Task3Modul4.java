package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task3Modul4 {
    public static void main (String... args) {
        int[] months = new int[13];
        for ( int i = 1; i <= months.length; i++ ) {
            months[1] = 31;
            months[2] = 28;
            months[3] = 31;
            months[4] = 30;
            months[5] = 31;
            months[6] = 30;
            months[7] = 31;
            months[8] = 31;
            months[9] = 30;
            months[10] = 31;
            months[11] = 30;
            months[12] = 31;
        }
        System.out.println("Type a number of the month to know how many days it has.");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        System.out.println("The month you chose has " + months[month] + " days");
    }
}
