package com.company;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int n =2;
        rotate_array(arr,n);
    }
    static void rotate_array(int[] arr , int n)
    {
        while (n >= 0)
        {
            int temp = arr[arr.length-1];
            for (int i = arr.length-1; i > 0 ; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] =temp;
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
