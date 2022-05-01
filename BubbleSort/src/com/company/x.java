package com.company;

import java.util.Arrays;

public class x {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        stack_cyclic_sort(arr);
    }
    static public void stack_cyclic_sort (int[] arr)
    {
        int[] arr_new = new int[arr.length];
        int i = 0 ;
        while(i < arr.length)
        {
            if (arr[i] == i+1)
            {
                arr_new[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr_new));
    }
}
