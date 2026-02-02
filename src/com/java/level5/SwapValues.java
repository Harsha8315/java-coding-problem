package com.java.level5;

import java.util.Scanner;

public class SwapValues {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1, num2;
            System.out.print("Enter First Number : ");
            num1= sc.nextInt();

            System.out.print("Enter Second Number : ");
            num2 = sc.nextInt();

            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;

            System.out.println("After Swap:");
            System.out.println("a = " + num1);
            System.out.println("b = " + num2);

            sc.close();
        }
    }


