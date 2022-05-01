package com.company;

import java.util.ArrayList;
import java.util.List;

public class NumberDisappearedInArray {
    public static void main(String[] args) {
//        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(fi);
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer>ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }
    static public void swap(int[] arr,int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
