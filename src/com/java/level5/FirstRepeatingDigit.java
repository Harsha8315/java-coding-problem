package com.java.level5;

import java.util.*;

public class FirstRepeatingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        int[] freq = new int[10];
        ArrayList<Integer> digits = new ArrayList<>();

        while(number > 0){
            digits.add(number % 10);
            number /= 10;
        }

        Collections.reverse(digits);

        for(int d : digits){
            freq[d]++;
            if(freq[d] == 2){
                System.out.println("First Repeating Digit = " + d);
                return;
            }
        }

        System.out.println("No Repeating Digit");
        sc.close();
    }
}

