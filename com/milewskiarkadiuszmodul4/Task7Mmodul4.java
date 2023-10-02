package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task7Mmodul4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz jakie działanie chcesz wykonać: dodawanie, odejmowanie, mnozenie, dzielenie");
        String calc = scanner.nextLine();


        switch (calc) {

            // Case 1
            case "dodawanie":

                // Print statement corresponding case
                System.out.println("Wybierz pierwszą liczbę");
                int numberOne = scanner.nextInt();
                System.out.println("Wybierz drugą liczbę");
                int numberTwo = scanner.nextInt();
                int result = numberOne + numberTwo;
                System.out.println(result);
                // break keyword terminates the
                // code execution here itself
                break;
            case "odejmowanie":

                // Print statement corresponding case
                System.out.println("Wybierz pierwszą liczbę");
                int odejmijOne = scanner.nextInt();
                System.out.println("Wybierz drugą liczbę");
                int odejmijTwo = scanner.nextInt();
                int resultOdejmij = odejmijOne - odejmijTwo;
                System.out.println(resultOdejmij);
                // break keyword terminates the
                // code execution here itself
                break;

            // Case 2
            case "mnozenie":

                // Print statement corresponding case
                System.out.println("Wybierz pierwszą liczbę");
                int multipleOne = scanner.nextInt();
                System.out.println("Wybierz drugą liczbę");
                int multipleTwo = scanner.nextInt();
                int resultMultiple = multipleOne * multipleTwo;
                System.out.println(resultMultiple);
                // break keyword terminates the
                // code execution here itself
                break;

            case "dzielenie":

                // Print statement corresponding case
                System.out.println("Wybierz pierwszą liczbę");
                double divideOne = scanner.nextDouble();
                System.out.println("Wybierz drugą liczbę");
                double divideTwo = scanner.nextDouble();
                double resultDivide = divideOne / divideTwo;
                System.out.println(resultDivide);
                // break keyword terminates the
                // code execution here itself
                break;
        }
    }
}


