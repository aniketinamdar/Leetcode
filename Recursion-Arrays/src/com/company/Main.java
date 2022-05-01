package com.company;

public class Main {

    public static void main(String[] args) {
	    //recursion array questions
        int[] arr = {1,2,3,4,5,0,7,8,9};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int index)
    {
        if (index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
