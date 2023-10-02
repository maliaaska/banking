package com.milewskiarkadiuszmodul4;


import java.util.Arrays;
import java.util.Scanner;

public class Task9Model4 {
    public static void main(String[] args) {
        System.out.println("Please choose an integer number");
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        int[] liczby = new int[nums];

        int sum = 0;
        for (int i = 1; i < liczby.length; i++) {  /* dlaczego przy urzydzie porownania wieksze bądz rowne wystepuje błąd i jak to moge obejsć) */
            if ( i % 2 == 1)
                continue;
            liczby[i] = i;
            sum = sum + i;

        }
        System.out.println(sum);

    }
}
