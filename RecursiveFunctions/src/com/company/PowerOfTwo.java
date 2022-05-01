package com.company;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(poweroftwo(16));
    }
    static public boolean poweroftwo(int n)
    {
        if (n == 0)
        {
            return false;
        }
        return helper(n,1);
    }

    static public boolean helper(int n, int i) {
        if (n == Math.pow(2,i))
        {
            return true;
        }
        return helper(n,i+1);
    }
}
