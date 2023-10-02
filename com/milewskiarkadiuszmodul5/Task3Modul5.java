package com.milewskiarkadiuszmodul5;

import java.util.Scanner;

public class Task3Modul5 {
    public static void main (String[] args) {
        System.out.println("Choose if you want to calculate the field of a circle or a rectangle /" +
                "Type 'circle' or 'rectangle' to process");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if(choice.equals("circle")) {
            System.out.println("blad");
            System.out.println("Type a radius length");
            int length = scanner.nextInt();
            System.out.println("The field of the circle is " + getArea(length) + " cm2");
        } else if (choice.equals("rectangle")){
            System.out.println("Type the length of the side 'a':  ");
            int a = scanner.nextInt();
            System.out.println("Type the length of the side 'b':  ");
            int b = scanner.nextInt();
            System.out.println("The field of the rectangle is " + getArea(a, b) + " cm2");
        } else {
            System.out.println("You didn't make a choice between rectangle or circle. Try again!!!");
        }
    }

    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double getArea(double a, double b) {
        return a * b;
    }

}
