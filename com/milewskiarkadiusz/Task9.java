package com.milewskiarkadiusz;

import java.util.Scanner;


public class Task9 {
    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość promienia koła: ");
        double r = scanner.nextInt();
        System.out.println(r);

        double pi = Math.PI;

        double power = Math.pow((pi * r), 2);

        System.out.println("Pole Twojego koła wynosi: " + power);
    }
}
