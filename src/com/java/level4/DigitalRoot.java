package com.java.level4;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        while(number >= 10){
            sum = 0;

            while(number > 0){
                sum += number % 10;
                number /= 10;
            }

            number = sum;
        }

        System.out.println("Digital Root = " + number);
        sc.close();
    }
}
