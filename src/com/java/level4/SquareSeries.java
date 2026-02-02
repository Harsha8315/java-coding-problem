package com.java.level4;

import java.util.Scanner;

public class SquareSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter Number: ");
        number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.print((i * i) + " ");
        }

        sc.close();
    }
}

