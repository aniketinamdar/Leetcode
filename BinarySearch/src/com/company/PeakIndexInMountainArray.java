package com.company;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,7,5,0};
        System.out.println(peakIndexInMountainArray(nums));
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start =  0 ;
        int end = arr.length - 1 ;
        while(start < end)
        {
            int mid = start + (end-start)/2 ;
            if (arr[mid]>arr[mid+1])
            {
                end = mid ;
            }
            else
            {
                start = mid + 1 ;
            }
        }
    return start ;
    }
}
