package com.company;

public class DuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] arr) {
        int i = 0 ;

        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return arr[j];
            }
        }
        return arr.length;
    }
    public void swap(int[] arr,int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
