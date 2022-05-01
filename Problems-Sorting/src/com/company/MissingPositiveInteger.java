package com.company;

public class MissingPositiveInteger {
    public static void main(String[] args) {

    }
    static public int firstMissingPositive(int[] arr) {
        int i = 0 ;
        while (i < arr.length){
            int correct = arr[i] - 1 ;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i]!= arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
            {
                return j+1;
            }
        }
//        return new int []{-1,-1};

        return -1;
    }
    static public void swap(int[] arr,int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
