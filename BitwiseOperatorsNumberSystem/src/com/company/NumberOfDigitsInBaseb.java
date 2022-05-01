package com.company;

public class NumberOfDigitsInBaseb {
    public static void main(String[] args) {
        System.out.println(number_digits(3456,10));
    }
    public static int number_digits(int number , int base)
    {
        int ans = (int)(Math.log(number)/Math.log(base))+1;
        return ans;
    }
}
