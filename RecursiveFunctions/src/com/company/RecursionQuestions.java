package com.company;

public class RecursionQuestions {
    static int sum = 0;
    static void reverse_number(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse_number(n / 10);

    }
    public static void main(String[] args) {
        printrev(5);
        printstraight(5);
        int a = factorial(5);
        System.out.println(a);
        System.out.println(sum(5 ));
        System.out.println(sum_digits(1342));
        reverse_number(1234);
        System.out.println(sum);
        System.out.println(product_digits(55));


    }

    public static void printstraight(int i) {
        if (i == 1)
        {
            System.out.println(i);
            return;
        }
        printstraight(i-1);
        System.out.println(i);
    }

    public static void printrev(int n)
    {
        if (n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printrev(n-1);
    }
    public static int factorial(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int sum(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        return n + sum(n-1);
    }
    public static int sum_digits(int n)
    {
        if (n==0)
        {
            return 0;
        }
        int rem = n % 10;
        n = n / 10 ;
        return rem + sum_digits(n);
    }
    public static int product_digits(int n)
    {
        if (n%10 == n)
        {
            return n;
        }
        int rem = n % 10;
        n = n / 10 ;
        return rem * product_digits(n);
    }

}
