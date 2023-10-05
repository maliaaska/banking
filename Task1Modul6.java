package com.milewskiarkadiuszmodul6.banking;

import java.util.Scanner;

public class Task1Modul6 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        Konto konto = new Konto();

        System.out.println("Wprowadź numer swojego konta skladajacego sie z 16-stu cyfr");
        String numerkonta = scanner.nextLine();
        konto.setNumerRachunku(numerkonta);
        double stanKonta = konto.getAccountBalance();
        boolean debet = konto.isDebet();

        konto.setStanKonta(stanKonta);

        System.out.println("Twoj numer rachunku to " + numerkonta + " and current balance is " + stanKonta + debet);


        konto.getAccount();
        konto.isDebet();

        if (!debet) {
            System.out.println("NIE jest debetowe!");
        }
    }


}
