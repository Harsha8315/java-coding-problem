package com.java.level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number, temp, sum;
        number = sc.nextInt();
        temp = number;
        sum = 0;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }

        if(number % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");

        sc.close();
    }
}
