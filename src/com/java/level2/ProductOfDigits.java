package com.java.level2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, product;
        product = 1;
        System.out.println("Enter the Number : ");
        number = sc.nextInt();
        while(number>0){
            digit = number%10;
            product = product * digit;
            number = number/10;
        }
        System.out.println("Product of numbers is : " + product);
        sc.close();
    }
}
