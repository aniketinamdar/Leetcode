package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 7};
        //swap(arr,1,3);
        //System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void reverse(int[] arr)
    {
        int start = 0 , end = arr.length-1;
        while (end>= start)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
