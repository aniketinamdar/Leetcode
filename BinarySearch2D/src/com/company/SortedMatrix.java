package com.company;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(SearchInSortedMatrix(arr,3)));
    }
    static public int[] SearchInSortedMatrix(int[][] arr, int target)
    {
        int rows = arr.length;
        int col = arr[0].length;
        if (rows==1)
        {
            return BinarySearch(arr,0,0,col-1,target);
        }
        int rStart = 0 ;
        int rEnd = rows - 1;
        int cMid = col/2;
        while (rStart < (rEnd-1))
        {
            int mid = rStart + (rEnd - rStart)/2;
            if (arr[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if (arr[mid][cMid]<target)
            {
                rStart = mid;
            }
            else
            {
                rEnd = mid;
            }
        }
        if (arr[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};
        }
        if (arr[rStart+1][cMid]==target)
        {
            return new int[]{rStart+1,cMid};
        }
        //1st Half
        if (target<= arr[rStart][cMid-1])
        {
            return BinarySearch(arr,rStart,0,cMid-1,target);
        }
        //2nd Half
        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][col-1])
        {
            return BinarySearch(arr,rStart,cMid+1,col-1,target);
        }
        //3rd Half
        if (target<= arr[rStart+1][cMid-1])
        {
            return BinarySearch(arr,rStart+1,0,cMid-1,target);
        }
        //4th Half
        else
        {
            return BinarySearch(arr,rStart+1,cMid+1,col-1,target);
        }
    }
    static public int[] BinarySearch(int[][] matrix,int row , int cStart , int cEnd , int target)
    {
        while (cStart <= cEnd)
        {
            int mid = cStart + (cEnd-cStart)/2;
            if (matrix[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target)
            {
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
    return new int[]{-1,-1};
    }
}
