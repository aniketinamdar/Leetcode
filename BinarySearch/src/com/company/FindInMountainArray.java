package com.company;

public class FindInMountainArray {
    public static void main(String[] args) {

    }
    static public int search(int[] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int ascending = binarySearch(arr,target,0, peak);
        if (ascending!=-1)
        {
            return ascending;
        }
        return OrderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
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
    static public int binarySearch(int[] nums , int target ,int start,int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if (nums[mid] > target)
            {
                end = mid - 1;
            }
            else if (nums[mid] < target)
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int OrderAgnosticBinarySearch(int[] arr , int target,int start,int end)
    {
        boolean isAscending = arr[start] < arr[end] ;
        while(start <= end)
        {
//            int mid = (start+end)/2;
            int mid = start + (end-start)/2;
            if (arr[mid] == target)
            {
                return mid;
            }
            if (isAscending) {
                if(target > arr[mid])
                {
                    start = mid + 1 ;
                }
                else if (target < arr[mid])
                {
                    end = mid -1 ;
                }
            }
            else
            {
                if(target > arr[mid])
                {
                    end = mid -1 ;
                }
                else if (target < arr[mid])
                {
                    start = mid + 1 ;
                }
            }
        }
        return -1;
    }
}
