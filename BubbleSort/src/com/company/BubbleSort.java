package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
/*Bubble Sort
    / Syncing Sort
        / Exchange Sort*/
//Stable Sorting Algorithm
public class BubbleSort {

    public static void main(String[] args) {
//        int[] nums = {3,1,5,4,2};
        int[] nums = {1,2,3,4};
        bubble_sort(nums);
    }
    static public void bubble_sort(int[] nums)
    {
        boolean swap ;
        for (int i = 0; i < nums.length ; i++) {
            swap = false;
            for (int j = 1 ; j < (nums.length - i); j++) {
                if (nums[j-1] > nums[j])
                {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swap = true;
                }
            }
            if (swap == false)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
