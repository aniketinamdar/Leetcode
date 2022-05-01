package com.company;

public class NumberOfSetBits {
    public static void main(String[] args) {
        System.out.println(num_setbits(25));
    }
    static public int num_setbits (int n)
    {
        int count = 0 ;
        while (n > 0)
        {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
