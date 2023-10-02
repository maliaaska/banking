package com.milewskiarkadiuszmodul4;

import java.util.Scanner;

public class Task12Model14 {
    public static void main (String[] args) {

        boolean[][] boats = {
                {true, true, true,false , false,},
                {false, false, true,false , true,},
                {true, false, true,false , true,},
                {true, false, false,false , false,},
                {true, false, true,false , false,},

        };

        System.out.println("Type the coordinates from 1-5 of the boat to see if your destroyed the Target!");
        System.out.println("Type the row number!");
        Scanner scanner = new Scanner(System.in);
        int boatRow = scanner.nextInt();
        System.out.println("Type the type te column number!");
        int boatCol = scanner.nextInt();

        for (int row = 0; row < boats.length; row ++) {
                for (int col = 0; col < boats[row].length; col++) {
                    break;
            }

        }
        if (boats[boatRow][boatCol]){
            System.out.println("Trafiony");
        } else {
            System.out.println("Pudło");
        }

    }
}
