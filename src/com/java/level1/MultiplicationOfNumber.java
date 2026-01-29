package com.java.level1;

import java.util.Scanner;

public class MultiplicationOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int result= n*i;
            System.out.println(n + " x " + i + " = " + result);
        }
        sc.close();
    }
}
