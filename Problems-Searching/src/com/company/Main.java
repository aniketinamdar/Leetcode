package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6};
        System.out.println(hIndex(arr));
    }
    static public int hIndex(int[] citations) {
        int start = 0 , end = citations.length-1;
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if (citations[mid] == citations.length - mid)
            {
                return citations[mid];
            }
            else if (citations[mid] > end+1-mid)
            {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1 ;
    }
}
