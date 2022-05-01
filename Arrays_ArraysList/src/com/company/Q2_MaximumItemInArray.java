package com.company;

public class Q2_MaximumItemInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8};
        int a = max(arr);
        System.out.println(a);
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}