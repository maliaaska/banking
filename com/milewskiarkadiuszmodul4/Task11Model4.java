package com.milewskiarkadiuszmodul4;

import java.util.Arrays;
import java.util.Scanner;

public class Task11Model4 {
    public static void main(String[] args) {
        System.out.println("Please choose an integer number");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i ; j++)
                System.out.print("*"); /* Dlaczego kiedy mam koncowke "ln" za "print" to tedy mi drukuje pojedyncze gwiazdki */
            System.out.println();
        }

    }

}
