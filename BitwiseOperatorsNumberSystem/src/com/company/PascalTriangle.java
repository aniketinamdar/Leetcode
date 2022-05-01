package com.company;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(sum_pascal_triangle(3));
    }
    static public int sum_pascal_triangle(int row)
    {
        int ans = (int)Math.pow(2,row-1);
        return ans;
    }
}
