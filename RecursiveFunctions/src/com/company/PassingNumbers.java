package com.company;

public class PassingNumbers {
    public static void main(String[] args) {
        func(5);
    }
    public static void func(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        func(--n);
        //func(n--);
        //n-- vs --n
        //first pass n and then subtract
        //first subtract and then pass n
    }
}
