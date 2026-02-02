package com.java.level4;

import java.util.Scanner;

public class SumOfFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum, fact, digit;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        sum = 0;

        while(number > 0){
            digit = number % 10;
            fact = 1;

            for(int i = 1; i <= digit; i++){
                fact *= i;
            }

            sum += fact;
            number /= 10;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
