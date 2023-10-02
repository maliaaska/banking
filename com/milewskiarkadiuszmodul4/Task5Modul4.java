package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task5Modul4 {
    public static void main (String[] args) {
        System.out.println("Type student's result in percentage");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        boolean isShorter = result.length() <= 3;
        boolean isLonger = result.length() == 4;
        boolean lessThanTen = result.length() < 3;

        if (lessThanTen) {
            System.out.println("you did not pass the exam");
        } else if (isShorter) {
            CharSequence number = result.subSequence(0, 2);
            int num = Integer.parseInt(number.toString());
            boolean isCorrect = num < 0 || num > 100;
            if (isCorrect) {
                System.out.println("This is not a correct info! Type the result from 0% to 100%");
            } else if ( !isCorrect && num > 50 ) {
                System.out.println("You ha e passed the exam!");
            } else {
                System.out.println("You failed the exam");
            }
            System.out.println(num);
        } else if ( isLonger ) {
            CharSequence number = result.subSequence(0, 3);
            int num = Integer.parseInt(number.toString()); // aby uzyć integer.ParseInt value musi byc stringiem wiec najpierw uzywamy methody .toString
            boolean isCorrect = num < 0 || num > 100;
            if (isCorrect) {
                System.out.println("This is not a correct info! Type the result from 0% to 100%");
            } else {
                System.out.println("you passed the exam");
            }
            System.out.println(num);

        }
    }
}
