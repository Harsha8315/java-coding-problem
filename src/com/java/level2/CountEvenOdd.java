package com.java.level2;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,digit,evenCount,oddCount;
        evenCount = 0;
        oddCount = 0;
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        while(number>0){
            digit = number%10;
            if(digit %2==0){
                evenCount = evenCount+1;
            } else{
                oddCount = oddCount+1;
            }
            number = number/10;
        }
        System.out.println("Even Numbers : " + evenCount);
        System.out.println("Odd Numbers : " + oddCount);
        sc.close();
    }
}
