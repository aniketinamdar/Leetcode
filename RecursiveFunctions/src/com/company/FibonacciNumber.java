package com.company;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = fibo(80);
        System.out.println(a);
    }
    public static int fibo (int n)
    {
        if (n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2); //recurrence relation
    }
    //0 1 1 2 3 5 8
}