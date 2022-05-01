package com.company;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(search(nums,target));
        System.out.println(duplicatefindPivot(nums));

    }
    static public int search(int[] nums, int target) {
        int pivot = finPivot(nums);
        int firstTry = binarySearch(nums,target,0,pivot);
        int secondTry = binarySearch(nums,target,pivot+1, nums.length-1);
        if (firstTry!=-1)
        {
            return firstTry;
        }
        else if (secondTry != -1)
        {
            return secondTry;
        }
        return -1;
    }
    static int binarySearch(int[] arr , int target , int start , int end) {
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target > arr[mid])
            {
                start = mid + 1 ;
            }
            else if (target < arr[mid])
            {
                end = mid -1 ;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static public int finPivot(int[] arr) {
        int start =  0 ;
        int end = arr.length - 1 ;
        while(start <= end)
        {
            int mid = start + (end-start)/2 ;
            if (mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if (arr[mid] <= arr[start])
            {
                end = mid -1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1 ;
    }
    static public int duplicatefindPivot(int[] arr) {
        int start =  0 ;
        int end = arr.length - 1 ;
        while(start <= end)
        {
            int mid = start + (end-start)/2 ;
            if (mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if (arr[mid]==arr[start] && arr[mid]==arr[end])
            {
                if (arr[start] > arr[start+1])
                {
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[end]<arr[mid])
            {
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1 ;
    }
}
