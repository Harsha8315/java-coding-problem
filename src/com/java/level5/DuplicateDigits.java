package com.java.level5;

import java.util.Scanner;

public class DuplicateDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        int[] freq = new int[10];

        while(number > 0){
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        System.out.print("Duplicate digits: ");
        for(int i = 0; i <= 9; i++){
            if(freq[i] > 1){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

