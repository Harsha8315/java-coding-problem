package com.java.level3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter Number: ");
        number = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= number; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
