package com.java.level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, digit, number;
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        max = 0;
        while(number>0){
            digit = number%10;
            if(digit>max){
                max = digit;
            }
            number = number/10;
        }
        System.out.println("Largest Number is : " + max);
        sc.close();
    }
}
