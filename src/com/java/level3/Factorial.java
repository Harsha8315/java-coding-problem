package com.java.level3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, factorial;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial of number : " + factorial);
        sc.close();
    }

}
