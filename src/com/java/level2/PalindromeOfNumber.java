package com.java.level2;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,original,reverse,digit;
        reverse = 0;
        System.out.println("Enter the Number : ");
        number = sc.nextInt();
        original = number;
        while(number>0){
            digit = number%10;
            reverse = reverse*10+digit;
            number = number/10;
        }
        if (reverse == original){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }

        sc.close();}
}
