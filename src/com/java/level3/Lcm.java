package com.java.level3;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, max;
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        while(true){
            if(max % num1 == 0 && max % num2 == 0){
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }

        sc.close();
    }
}
