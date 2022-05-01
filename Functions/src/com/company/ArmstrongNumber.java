package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isArmStrong(num));
        for (int i = 100 ; i < 1000 ; i++) {
            if (isArmStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmStrong(int num) {
        int original = num ;
        int sum = 0  ;
        while (num > 0)
        {
            int rem = num % 10 ;
            sum += rem * rem * rem ; ;
            num /= 10 ;
        }
        return sum == original;
    }
}
