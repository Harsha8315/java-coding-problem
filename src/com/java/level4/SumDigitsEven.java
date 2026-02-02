package com.java.level4;

import java.util.Scanner;

public class SumDigitsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp, sum;
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        for(int num = 1; num <= number; num++){
            temp = num;
            sum = 0;

            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }

            if(sum % 2 == 0){
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
