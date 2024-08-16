package com.hyperskill;

import java.util.Scanner;

public class Aritmethic {

        /*
        Given two integers, your task is to calculate their sum, multiplication result,
        and the result of the first integer divided by the second integer (without decimal places).
        You can assume that the second integer is never zero. First, scan two integers from the standard input.
        Then, print the three results in separate lines: the sum, multiplication result, and division result.
         */
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read the first integer
        int num1 = scan.nextInt();
        // Read the second integer
        int num2 = scan.nextInt();

        public void calculation(int num1, int num2) {
            int sum = num1 + num2;
            int mult = num1 * num2;
            int division = num1 / num2;
            System.out.println(sum);
            System.out.println(mult);
            System.out.println(division);
        }
}
