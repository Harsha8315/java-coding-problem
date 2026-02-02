package com.java.level5;

import java.util.Scanner;

public class IncreasingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, prevDigit, digit;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        prevDigit = 10;

        while(number > 0){
            digit = number % 10;

            if(digit >= prevDigit){
                System.out.println("Not Increasing");
                return;
            }

            prevDigit = digit;
            number /= 10;
        }

        System.out.println("Increasing Order");
        sc.close();
    }
}

