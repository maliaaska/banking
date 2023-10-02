package com.milewskiarkadiuszmodul5;

public class task10Modul5 {
    public static void main (String... args) {
        int liczbaPierwsza = 7;
        int liczbaDruga = 14;

        Mianownik(  liczbaPierwsza,
                    liczbaDruga);
    }

    public static void Mianownik ( int liczbaPierwsza, int liczbaDruga) {
        int count = liczbaDruga - 1 ;
        if (liczbaPierwsza % liczbaDruga == 0){
            System.out.println("Liczba " + liczbaDruga + " to najwiekszy wspólny mianownik");
        } else {
            for (int i = 0; i < liczbaDruga; i++) {
                count--;
                if ( liczbaPierwsza % count == 0){
                    if (count == 1 ) {
                        count = liczbaDruga * liczbaPierwsza;
                        System.out.println("Numer " + count + " jest najwiekszym wspólnym mianownikiem.");
                    }
                }
            }
        }
    }
}
