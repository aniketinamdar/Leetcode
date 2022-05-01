package com.company;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,4,8,9};
//        System.out.println(linear_search(arr,9,0));
//        System.out.println(linear_search_index(arr,9,0));
//        linear_search_index2(arr,4,0);
//        System.out.println(list);
        System.out.println(linear_search_index3(arr,4,0,new ArrayList<>()));
    }
    static boolean linear_search(int[] arr , int target ,int index)
    {
        if (index > arr.length-1)
        {
            return false;
        }
        //return arr[index]==target || linear_search(arr,target,index+1);
        if (arr[index]==target)
        {
            return true;
        }
        return linear_search(arr,target,index+1);
    }
    static int linear_search_index(int[] arr , int target ,int index)
    {
        if (index > arr.length-1)
        {
            return -1;
        }
        //return arr[index]==target || linear_search(arr,target,index+1);
        if (arr[index]==target)
        {
            return index;
        }
        return linear_search_index(arr,target,index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void linear_search_index2(int[] arr , int target ,int index)
    {
        if (index > arr.length-1)
        {
            return;
        }
        //return arr[index]==target || linear_search(arr,target,index+1);
        if (arr[index]==target)
        {
            list.add(index);
        }
        linear_search_index2(arr,target,index+1);
    }
    static ArrayList linear_search_index3(int[] arr , int target ,int index, ArrayList<Integer> list)
    {
        if (index > arr.length-1)
        {
            return list;
        }
        //return arr[index]==target || linear_search(arr,target,index+1);
        if (arr[index]==target)
        {
            list.add(index);
        }
        return linear_search_index3(arr,target,index+1,list);
    }

}
