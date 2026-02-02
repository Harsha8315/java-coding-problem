package com.java.level4;

import java.util.Scanner;

public class OnesSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, num;
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        num = 0;

        for(int i = 1; i <= number; i++){
            num = num * 10 + 1;
            System.out.print(num + " ");
        }

        sc.close();
    }
}
