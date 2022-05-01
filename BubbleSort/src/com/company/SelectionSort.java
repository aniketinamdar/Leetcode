package com.company;

import java.util.Arrays;
//Not stable
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection_sort(arr);
    }
    static public void selection_sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            //find max in remaining
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
        System.out.println(Arrays.toString(arr));
    }
    static public int getMax(int[]arr,int start ,int last)
    {
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[max]<arr[i])
            {
                max = i;
            }
        }
        return max;
    }
    static public void swap(int[]arr,int first ,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
