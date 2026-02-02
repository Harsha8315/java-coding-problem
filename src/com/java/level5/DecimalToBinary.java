package com.java.level5;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, binary, place;
        System.out.print("Enter decimal number: ");
        number = sc.nextInt();

        binary = 0;
        place = 1;

        while(number > 0){
            int remainder = number % 2;
            binary = binary + remainder * place;
            place *= 10;
            number /= 2;
        }

        System.out.println("Binary = " + binary);
        sc.close();
    }
}

