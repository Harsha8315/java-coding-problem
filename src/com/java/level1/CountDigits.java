package com.java.level1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter no of numbers to be printed : ");
        int number = sc.nextInt();
        while(number>0){
            number = number/10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
