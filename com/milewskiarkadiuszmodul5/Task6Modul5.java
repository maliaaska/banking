package com.milewskiarkadiuszmodul5;

import java.util.Scanner;

public class Task6Modul5 {
    public static void main(String[] args) {

        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int random = 0;

        for (int i = 1; i < 101; i++) {
            random = (int) (Math.random() * range) + min;
        }

        System.out.println(random);


        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            if (input == 0) {
                System.out.println("try to guess the input between 1-100 the program chose randomly");
            } else if (input > random) {
                System.out.println("the input " + input + " is too high. Try again");

            } else if (input < random) {
                System.out.println("the input " + input + " is too low. Try again");

            }
            input = scanner.nextInt();
        }

        while (input != random);

        check(input, random);

    }

    public static boolean check(int input, int random) {
        System.out.println("YES!!!! the input " + input + " is the correct one!");
        return true;

    }
}
