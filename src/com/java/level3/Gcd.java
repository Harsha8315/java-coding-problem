package com.java.level3;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, gcd, min;
        System.out.print("Enter a: ");
        num1 = sc.nextInt();

        System.out.print("Enter b: ");
        num2 = sc.nextInt();
        gcd = 1;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
        sc.close();
    }
}
