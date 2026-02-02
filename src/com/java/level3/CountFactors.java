package com.java.level3;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count;
        System.out.println("Enter number: ");
        number = sc.nextInt();
        count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println("Total Factors : " + count);
        sc.close();
    }
}
