package com.java.level2;

import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Not Prime");
        }

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
