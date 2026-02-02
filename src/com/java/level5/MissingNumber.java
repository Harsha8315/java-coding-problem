package com.java.level5;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        int[] arr = new int[number - 1];
        System.out.println("Enter " + (number - 1) + " numbers:");

        for(int i = 0; i < number - 1; i++){
            arr[i] = sc.nextInt();
        }

        int expectedSum = number * (number + 1) / 2;
        int actualSum = 0;

        for(int x : arr){
            actualSum += x;
        }

        System.out.println("Missing Number = " + (expectedSum - actualSum));
        sc.close();
    }
}

