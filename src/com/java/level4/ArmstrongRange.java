package com.java.level4;

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp, temp2, sum, count, digit, power;
        System.out.print("Enter N: ");
        number = sc.nextInt();

        for(int num = 1; num <= number; num++){
            temp = num;
            temp2 = num;
            sum = 0;
            count = 0;

            while(temp2 > 0){
                temp2 /= 10;
                count++;
            }

            while(temp > 0){
                digit = temp % 10;
                power = 1;
                for (int i = 1; i <= count; i++) {
                    power = power * digit;
                }

                sum += power;
                temp /= 10;
            }

            if(sum == num){
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
