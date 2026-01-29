package com.java.level2;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + number + ":");

        for (int num = 2; num <= number; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
