package com.company;

import java.util.Arrays;
//Missing Number
public class Main {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    static public int missingNumber(int[] arr)
    {
        int i = 0 ;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j) {
                    return j;
                }
            }
        return arr.length;
    }
    static public void swap(int[] arr,int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
