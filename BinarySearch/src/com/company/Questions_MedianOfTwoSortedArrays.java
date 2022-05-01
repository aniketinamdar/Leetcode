package com.company;

public class Questions_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,12,24};
        System.out.println(ceiling_number(arr,10));
        System.out.println(floor_number(arr,10));
    }
    static int ceiling_number(int[] arr ,int target)
    {
        int start = 0 ;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if (arr[mid] > target)
            {
                end = mid - 1;
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    static int floor_number(int[] arr ,int target)
    {
        int start = 0 ;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if (arr[mid] > target)
            {
                end = mid - 1;
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
