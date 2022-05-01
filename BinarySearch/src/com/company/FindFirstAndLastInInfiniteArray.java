package com.company;

public class FindFirstAndLastInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10,23};
        int t = 3;
        System.out.println(findRange(arr,t));
    }
    static public int findRange(int[] arr , int target)
    {
        int start = 0 ;
        int end = 1;
        while(target > arr[end])
        {
            int temp = end + 1 ;
            end =  end + (end-start+1) * 2 ;
            start = temp ;
        }
        return binarySearch(arr,target,start,end);
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
}
