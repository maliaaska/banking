package com.milewskiarkadiusz;

import java.util.Scanner;

public class Task8 {
    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość trójkąta: ");
        double h = scanner.nextInt();
        System.out.println(h);

        System.out.println("Podaj podstawę trójkąta: ");
        double a = scanner.nextInt();
        System.out.println(a);

        System.out.println("Pole Twojego trójkata wnosi: " + (h * a / 2));
    }
}
