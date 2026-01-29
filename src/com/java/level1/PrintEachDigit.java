package com.java.level1;

import java.util.Scanner;

public class PrintEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        System.out.println("Enter no of numbers to be printed : ");
        int number = sc.nextInt();
        while(number>0) {
            digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
        sc.close();
    }
}
