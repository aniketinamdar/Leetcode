package com.company;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(findMin(arr));
    }
    static public int findMin(int[] nums) {
        int ans = duplicatefindPivot(nums);
        if (ans == nums.length-1)
        {
            return nums[0];
        }
        else if(ans < nums.length-1)
        {
            return nums[ans+1];
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
