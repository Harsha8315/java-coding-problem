package com.java.level4;

import java.util.Scanner;

public class PalindromeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp, reverse;
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        for(int num = 1; num <= number; num++){
            temp = num;
            reverse = 0;

            while(temp > 0){
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }

            if(reverse == num){
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}

