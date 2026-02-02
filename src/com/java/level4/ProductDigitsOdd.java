package com.java.level4;

import java.util.Scanner;

public class ProductDigitsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp, digit;
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        for(int num = 1; num <= number; num++){
            temp = num;
            boolean isValid = true;

            while(temp > 0){
                digit = temp % 10;

                if(digit % 2 == 0){
                    isValid = false;
                    break;
                }

                temp /= 10;
            }

            if(isValid){
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
