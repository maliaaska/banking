package com.milewskiarkadiuszmodul5;

public class Task4Modul5 {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("there is no argument");
        } else {
            getLongestArgument(args);
        }
    }

    public static String getLongestArgument(String[] arguments) { // Dlaczego wystepuje w tej linijcie worning ze metoda is never used.
        // Dlaczego w momencie braku argumentow występuje blad ze index jest poza zasiegiem? Nie jestem w stanie nigdzie odpowiednio wydrukowac 'brak argumentow!!!!'
        String longArg= arguments[0];

        for (int i = 0;i < arguments.length; i++) {
            if (arguments[i].length() > longArg.length()) {
                longArg = arguments[i];
            }
        }
        System.out.println(longArg);
        return longArg;
    }
}
