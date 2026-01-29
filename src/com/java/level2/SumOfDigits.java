package com.java.level2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, sum;
        sum = 0;
        System.out.println("Enter the Number : ");
        number = sc.nextInt();
        while(number>0){
            digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum of numbers is : " + sum);
        sc.close();
    }
}
