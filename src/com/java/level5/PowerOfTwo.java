package com.java.level5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        if(number <= 0){
            System.out.println("Not Power of 2");
            return;
        }

        while(number % 2 == 0){
            number /= 2;
        }

        if(number == 1)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");

        sc.close();
    }
}

