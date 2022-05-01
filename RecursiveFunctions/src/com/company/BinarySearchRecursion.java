package com.company;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9};
        System.out.println(binary_search_recursion(arr,4,0,arr.length-1));
    }
    public static int binary_search_recursion(int[] arr, int target , int s , int e)
    {
       if (s > e)
       {
           return -1;
       }
       int m = s + (e - s)/2;
       if (arr[m] == target)
       {
           return m;
       }
       if (target < arr[m])
       {
           return binary_search_recursion(arr,target,s,m-1);
       }
        return binary_search_recursion(arr,target,m+1,e);
    }
}
