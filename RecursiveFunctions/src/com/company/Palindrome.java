package com.company;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(count_number_zeroes(39903));
    }
    public static int count_number_zeroes(int n)
    {
        return helper (n,0);
    }
    public static int helper(int n , int c)
    {
        if (n == 0)
        {
            return c;
        }
        int rem = n % 10 ;
        if (rem == 0)
        {
            return helper(n/10,c+1);
        }
        return helper(n/10,c);

    }
}
