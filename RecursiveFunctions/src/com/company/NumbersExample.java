package com.company;

public class NumbersExample {
    public static void main(String[] args) {
        print(1);
    }
//    public static void print1(int n)
//    {
//        System.out.println(n);
//        print2(n-1);
//    }
//    public static void print2(int n)
//    {
//        System.out.println(n);
//        print3(n-1);
//    }
//    public static void print3(int n)
//    {
//        System.out.println(n);
//        print4(n-1);
//    }
//    public static void print4(int n)
//    {
//        System.out.println(n);
//        print5(n-1);
//    }
//    public static void print5(int n)
//    {
//        System.out.println(n);
//    }
    public static void print(int n)
    {
        if(n==5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
