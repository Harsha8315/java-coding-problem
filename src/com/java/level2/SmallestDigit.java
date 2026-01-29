package com.java.level2;

import java.util.Scanner;

public class SmallestDigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int min, digit, number;
            System.out.println("Enter the number : ");
            number = sc.nextInt();
            min = number%10;
            while (number > 0) {
                digit = number % 10;
                if (digit < min) {
                    min = digit;
                }
                number = number / 10;
            }
            System.out.println("Smallest Number is : " + min);
            sc.close();
        }
}