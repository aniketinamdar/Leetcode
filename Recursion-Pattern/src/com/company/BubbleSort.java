package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        pattern1(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void pattern1(int[]arr , int row,int col)
    {
        if (row == 0)
        {
            return;
        }
        if (col<row)
        {
            if (arr[col]>arr[col+1])
            {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp ;
            }
            pattern1(arr,row,col+1);
        }
        else
        {
            System.out.println();
            pattern1(arr,row-1,0);
        }
    }
}
