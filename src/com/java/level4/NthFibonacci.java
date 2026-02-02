package com.java.level4;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, a, b;
        System.out.print("Enter N: ");
        number = sc.nextInt();
        a = 0;
        b = 1;

        if(number == 1){
            System.out.println(a);
        } else if(number == 2){
            System.out.println(b);
        } else {
            for(int i = 3; i <= number; i++){
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }

        sc.close();
    }
}

