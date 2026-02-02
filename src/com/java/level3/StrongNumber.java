package com.java.level3;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, original, sum, digit, fact;
        System.out.println("Enter number: ");
        number = sc.nextInt();
        original = number;
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
        if(sum == original)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");

        sc.close();
    }
}
