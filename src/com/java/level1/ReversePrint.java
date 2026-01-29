package com.java.level1;

import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of numbers to be printed : ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
        sc.close();
    }
}
