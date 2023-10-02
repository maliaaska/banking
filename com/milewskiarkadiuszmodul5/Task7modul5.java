package com.milewskiarkadiuszmodul5;

import java.util.Scanner;

public class Task7modul5 {

    enum Season {
        Spring,
        Summer,
        Autumn,
        Winter
    }


    public static void main (String[] args) {


        System.out.println("Type the month number to see which season it is");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();


        checkSeason(monthNumber);

    }
    public static Season checkSeason (int input) {
        Season season = null;
        if ( input < 4) {
            season = Season.Winter;
            System.out.println("The month you chose is a " + season + "time!");
        } else if ( input < 7) {
            season = Season.Spring;
            System.out.println("The month you chose is a " + season + "time!");
        } else if ( input < 10) {
            season = Season.Summer;
            System.out.println("The month you chose is a " + season + "time!");
        } else if ( input < 13) {
            season = Season.Autumn;
            System.out.println("The month you chose is a " + season + "time!");
        } else {
            System.out.println("ERRRRR  You must chose between 1-12");
        }


        return season;
    }

}
