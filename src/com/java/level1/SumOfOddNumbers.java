package com.java.level1;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            if(i%2!=0) {
                sum = sum + i;
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
