package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Podaj Swój wzrost i mase, aby obliczyć BMI ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj masę ciała w kg: ");
        double masaCiala = scanner.nextDouble();
        System.out.println(masaCiala + "kg");

        System.out.println("Podaj swój wzrost w metrach: ");
        double wzrost = scanner.nextDouble();
        System.out.println(wzrost + "m.");

        double bmi = masaCiala / (Math.pow(wzrost, 2));
        System.out.println("Twoje BMI wynosi: " + bmi);
    }
}
