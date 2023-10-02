package com.milewskiarkadiuszmodul5;

import java.util.Arrays;
import java.util.Scanner;

public class Task9Modul5 {

    public static void main(String[] args) {
        System.out.println("Wybierz 6 liczb pomiedzy 1-49. After each choice click enter");
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int[] chosenNum = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 49 + 1);
        }
        System.out.println(Arrays.toString(chosenNum));
        System.out.println(Arrays.toString(numbers));
        Check(chosenNum, numbers);
    }

    public static void Check(int[] chosenNum, int[] numbers) {
        int counter = 0;

        for (int i = 0; i < chosenNum.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (chosenNum[i] == numbers[i]) {
                    counter++;
                    break;
                }
            }

        }
        System.out.println("You have guessed " + counter + " numbers");

    }

}
