package com.milewskiarkadiuszmodul6.banking;

import java.util.Scanner;

public class Task1Modul6 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);


        Konto konto = new Konto();
        konto.accountBalance();
        konto.getAccount();
        konto.isDebet();
    }


}
