package com.company;

import java.util.Arrays;

public class MergeSort {
    //time complexity : N log N
    //Merge sort using recursion
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] ans = merge_sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge_sort(int[] arr)
    {
        if (arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int []right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge_sort(left,right);
    }

    public static int[] merge_sort(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int i = 0 , j = 0 , k = 0 ;
        while(i< first.length && j< second.length)
        {
            if (first[i]<second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else
            {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
