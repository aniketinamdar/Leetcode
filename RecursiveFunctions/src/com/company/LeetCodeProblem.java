package com.company;

public class LeetCodeProblem {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static public int numberOfSteps(int num) {
        return helper(num , 0);
    }

    static public int helper(int num, int i) {
        if (num == 0)
        {
            return i;
        }
        if (num % 2 == 0)
        {
            return helper(num/2,i+1);
        }
        return helper(num-1,i+1);
    }
}
