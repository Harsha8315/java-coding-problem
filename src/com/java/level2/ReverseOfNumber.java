package com.java.level2;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int reverse, number, digit;
        System.out.println("Enter the number : ");
        reverse = 0;
        number = sc.nextInt();
        while(number>0){
            digit = number%10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        System.out.println("Reverse of the number is : " + reverse);
        sc.close();
    }
}
