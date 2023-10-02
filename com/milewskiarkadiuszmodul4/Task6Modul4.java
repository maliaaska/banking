package com.milewskiarkadiuszmodul4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6Modul4 {
    public static void main(String... args) {



        for ( int i = 1; i < 101; i++) {
            if ( i % 3 == 0 ) {
                System.out.println(i + " is dividable by 3");
            } else if ( i % 5 == 0 ) {
                System.out.println(i + " is dividable by 5");
            } else {
                System.out.println(i);
            }
        }
    }
}
