package com.company;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
        int[] arr = {10 , 9 , 8 , 3};
        System.out.println(OrderAgnosticBinarySearch(arr,3));
    }
    static int OrderAgnosticBinarySearch(int[] arr , int target)
    {
        int start = 0 ;
        int end = arr.length - 1 ;
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
