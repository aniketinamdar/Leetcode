package com.company;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun("Hello World");
        fun(4);
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String s)
    {
        System.out.println(s);
    }
}
