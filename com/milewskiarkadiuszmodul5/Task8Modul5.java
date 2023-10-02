package com.milewskiarkadiuszmodul5;

import java.util.Arrays;
import java.util.Scanner;


public class Task8Modul5 {
    public static void main (String[] args) {

        System.out.println("Type three numbers in the console.After each number tap enter ");

        numbers(args);


    }
    public static int[] numbers (String[] args) {
        Scanner scanner = new Scanner(System.in);
        args = new String[]{scanner.nextLine(),scanner.nextLine(),scanner.nextLine()};

        int size = args.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(arr));

        int biggest = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }

        }
        System.out.println("the biggest number is: " + biggest);
        return arr;
    }
    

}
