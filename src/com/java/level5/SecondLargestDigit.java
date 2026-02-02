package com.java.level5;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, max, secondMax;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        max = -1;
        secondMax = -1;

        while(number > 0){
            int digit = number % 10;

            if(digit > max){
                secondMax = max;
                max = digit;
            } else if(digit != max && digit > secondMax){
                secondMax = digit;
            }

            number /= 10;
        }

        System.out.println("Second Largest Digit = " + secondMax);
        sc.close();
    }
}
