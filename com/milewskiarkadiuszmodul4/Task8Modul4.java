package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task8Modul4 {
    public static void main (String... args) {
        int[] numbers = {5,10,27,35,48};
        System.out.println("Please choose a number between 0-50 to see if it is in the array!");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {

            case 5,10,27,35,48:
                System.out.println("Congrats, the number you chose is in the Array");
        }


    }
}
