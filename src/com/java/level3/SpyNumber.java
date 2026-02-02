package com.java.level3;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum, product;
        System.out.print("Enter number: ");
        number = sc.nextInt();
        sum = 0;
        product = 1;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        if(sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");

        sc.close();
    }

}
