package com.java.level2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum, temp,digit,count,original;
        sum = 0;
        count = 0;
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        original = number;
        temp = number;
        while(temp>0){
            temp = temp/10;
            count = count + 1;
        }
        while(number>0){
            digit = number%10;
            int power = 1;
            for(int i =1; i<= count; i++){
                power = power * digit;
            }
            sum = sum + power;
            number = number/10;
        }
        if(sum == original){
            System.out.println("The Number is Armstrong Number");
        }else {
            System.out.println("The Number is not Armstrong Number");
        }
        sc.close();
    }
}
