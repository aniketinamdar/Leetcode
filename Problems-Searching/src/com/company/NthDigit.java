package com.company;

public class NthDigit {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    static public int arrangeCoins(int n) {
        int ans = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            n=n-i;
            if(n<= 0)
            {
                ans = i;
            }
        }
        return ans;
    }
}
