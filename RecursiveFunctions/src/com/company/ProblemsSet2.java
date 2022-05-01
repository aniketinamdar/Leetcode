package com.company;

public class ProblemsSet2 {
    static int sum = 0;
    public static void reverse_number1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse_number1(n / 10);
    }
    public static int reverse_number2(int n) {
        int digits = (int)(Math.log10(n))+1;
        return helper(n , digits);
    }

    public static int helper(int n, int digits) {
        if (n%10==n)
        {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        reverse_number1(1234);
        System.out.println(sum);
        System.out.println(reverse_number2(1234));
    }
}

