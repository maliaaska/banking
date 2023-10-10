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
        boolean debet = konto.isDebet(); // Jak można ominąć wydruk słówka null?


        konto.setStanKonta(stanKonta);

        System.out.println("Twoj numer rachunku to " + numerkonta + " i obecny stan konta to " + stanKonta);
        System.out.println("Konto posiada debet: " + debet);

        System.out.println("Podaj ile chcesz wpłacić środków?");
        double wplata = scanner.nextDouble();
        konto.setWplacSrodki(wplata);
        System.out.println("Twoj obecny stan konta to " + stanKonta);  // Dlaczego w tym przypadku nie pobiera zauktualizowanego stanu konta?
        System.out.println(stanKonta);

    }


}
